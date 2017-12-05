package br.fatec.poo;

public class Produto {
    private int codProd;
    private String nome;
    private int quantidade;
    private double valor;

    public Produto(String codProduto, String nome, String quantidade, String valor) {
        this.codProd = Integer.valueOf(codProduto);
        this.nome = nome;
        this.quantidade = Integer.valueOf(quantidade);
        this.valor = Double.valueOf(valor);
    }

    public int getCodProd() {
        return codProd;
    }

    public void setCodProd(int codProd) {
        this.codProd = codProd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
