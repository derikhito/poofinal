package br.fatec.poo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ProdutosView extends JFrame implements ActionListener {
    private Dimension dFrame;
    private Dimension dLabel;
    private Dimension dTextField;
    private Dimension dButton;

    private Label lblCodigoProduto;
    private TextField txtCodigoProduto;

    private Label lblNome;
    private TextField txtNome;

    private Label lblQuantidade;
    private TextField txtQuantidade;

    private Label lblValor;
    private TextField txtValor;

    private Button cmdAdicionar;
    private Button cmdLimpar;
    private Button cmdSair;

    private List<Produto> produtos;

    public ProdutosView() {
        dFrame = new Dimension(350, 400);
        dLabel = new Dimension(40, 20);
        dTextField = new Dimension(150, 20);
        dButton = new Dimension(95, 20);

        this.setSize(dFrame);

        lblCodigoProduto = new Label("Código Produto: ");
        lblCodigoProduto.setSize(dLabel);
        lblCodigoProduto.setLocation(25, 50);
        this.add(lblCodigoProduto);

        txtCodigoProduto = new TextField();
        txtCodigoProduto.setSize(dTextField);
        txtCodigoProduto.setLocation(75, 50);
        this.add(txtCodigoProduto);

        lblNome = new Label("Nome: ");
        lblNome.setSize(dLabel);
        lblNome.setLocation(25, 80);
        this.add(lblNome);

        txtNome = new TextField();
        txtNome.setSize(dTextField);
        txtNome.setLocation(75, 80);
        this.add(txtNome);

        lblQuantidade = new Label("Quantidade: ");
        lblQuantidade.setSize(dLabel);
        lblQuantidade.setLocation(25, 110);
        this.add(lblQuantidade);

        txtQuantidade = new TextField();
        txtQuantidade.setSize(dTextField);
        txtQuantidade.setLocation(75, 110);
        this.add(txtQuantidade);

        lblValor = new Label("Valor: ");
        lblValor.setSize(dLabel);
        lblValor.setLocation(25, 140);
        this.add(lblValor);

        txtValor = new TextField();
        txtValor.setSize(dTextField);
        txtValor.setLocation(75, 140);
        this.add(txtValor);

        cmdAdicionar = new Button("Adicionar");
        cmdAdicionar.setSize(dButton);
        cmdAdicionar.addActionListener(this);
        cmdAdicionar.setLocation(0, 0);
        this.add(cmdAdicionar);

        cmdLimpar = new Button("Limpar");
        cmdLimpar.setSize(dButton);
        cmdLimpar.addActionListener(this);
        cmdLimpar.setLocation(0, 0);
        this.add(cmdLimpar);

        cmdSair = new Button("Sair");
        cmdSair.setSize(dButton);
        cmdSair.addActionListener(this);
        cmdSair.setLocation(0, 0);
        this.add(cmdSair);

        produtos = new ArrayList<>();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cmdAdicionar) {
            String codProduto, nome, quantidade, valor;

            codProduto = txtCodigoProduto.getText();
            nome = txtNome.getText();
            quantidade = txtQuantidade.getText();
            valor = txtValor.getText();

            Produto produto = new Produto(codProduto, nome, quantidade, valor);
            produtos.add(produto);
        }

        if (e.getSource() == cmdLimpar) {
            produtos = new ArrayList<>();

        }

        if (e.getSource() == cmdSair) {
            System.exit(0);
        }
    }
}
