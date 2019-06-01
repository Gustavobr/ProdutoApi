/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProdutoApi.ProdutoApi;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto  implements Serializable{

    public Produto() {
    }
    
    
    
    public Produto(long id_produto, String descricao, float preco, String quantidade){
        this.id_produto = id_produto;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_produto;
    private String descricao;
    private float preco;
    private String quantidade;

    public long getId_produto() {
        return id_produto;
    }

    public void setId_produto(long id_produto) {
        this.id_produto = id_produto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }
}
