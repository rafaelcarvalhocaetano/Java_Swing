/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Developer
 */
public class Produto {
    
    private int id;
    private String descricao;
    private int qtd;
    private double preco;
    public String getDescricao;

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQtd() {
        return qtd;
    }

    public double getPreco() {
        return preco;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
    
    
    
}
