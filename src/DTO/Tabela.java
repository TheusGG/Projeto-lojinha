/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.io.Serializable;
import java.util.ArrayList;

public class Tabela {

    String Codigo, Produto;
    double ValorUnitario, Quantidade;
    Float ValorTotal;
    private ArrayList<Tabela> itensVenda = new ArrayList<Tabela>();

    public Tabela() {

        itensVenda = new ArrayList<Tabela>();
    }

    public String getCodigo() {
        return Codigo;
    }

    public ArrayList<Tabela> getItensVenda() {
        return itensVenda;
    }

    public void setItensVenda(ArrayList<Tabela> itensVenda) {
        this.itensVenda = itensVenda;
    }

    public void adicionarItem(Tabela itemVenda) {
        this.itensVenda.add(itemVenda);
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getProduto() {
        return Produto;
    }

    public void setProduto(String Produto) {
        this.Produto = Produto;
    }

    public double getValorUnitario() {
        return ValorUnitario;
    }

    public void setValorUnitario(double ValorUnitario) {
        this.ValorUnitario = ValorUnitario;
    }

    public Float getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(Float ValorTotal) {
        this.ValorTotal = ValorTotal;
    }

    public double getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(double Quantidade) {
        this.Quantidade = Quantidade;
    }

}
