package dao;

import bean.Dados;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DadosDAO {

    public void create(Dados dados) throws SQLException {

        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO dados ");
        sql.append("(nome, senha) ");
        sql.append("VALUES (?, ?)");

        Connection ct = ConnectionFactory.getConectando();
        PreparedStatement cmd = ct.prepareStatement(sql.toString());
        
        cmd.setString(1, dados.getNome());
        cmd.setString(2, dados.getSenha());

        cmd.executeUpdate();

        

    }

}
