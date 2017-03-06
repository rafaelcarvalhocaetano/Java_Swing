/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import conection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.Produto;

/**
 *
 * @author Developer
 */
public class ProdutoDAO {

    public void create(Produto p) throws SQLException {

        Connection con = ConnectionFactory.getConectar();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO dbmercadinho (descricao, qtd, preco) VALUES(?, ?, ?)");
            stmt.setString(1, p.getDescricao());
            stmt.setInt(2, p.getQtd());
            stmt.setDouble(3, p.getPreco());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: "+e);
            e.printStackTrace();
        }finally{
            ConnectionFactory.closeConnection((com.mysql.jdbc.Connection) con, stmt);
        }
    }

}
