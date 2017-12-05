package br.fatec.poo;

import java.util.Date;
import java.util.List;

public class Pedido {
    private int numPedido;
    private Date data;
    private double valorTotal;
    private List<ItemPedido> itens;

    public Pedido(int numPedido, Date data, double valorTotal, List<ItemPedido> itens) {
        this.numPedido = numPedido;
        this.data = data;
        this.valorTotal = valorTotal;
        this.itens = itens;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }
}

