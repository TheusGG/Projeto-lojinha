/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.io.Serializable;

public class Produto implements Serializable{
    String IDPro,Produto,Categoria;
    double ValorC, ValorV,Quantidade;

    public String getIDPro() {
        return IDPro;
    }

    public void setIDPro(String IDPro) {
        this.IDPro = IDPro;
    }

    public String getProduto() {
        return Produto;
    }

    public void setProduto(String Produto) {
        this.Produto = Produto;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public double getValorC() {
        return ValorC;
    }

    public void setValorC(double ValorC) {
        this.ValorC = ValorC;
    }

    public double getValorV() {
        return ValorV;
    }

    public void setValorV(double ValorV) {
        this.ValorV = ValorV;
    }

    public double getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(double Quantidade) {
        this.Quantidade = Quantidade;
    }

    
    
    
}
