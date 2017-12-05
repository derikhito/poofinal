package br.fatec.poo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PedidoView extends JFrame implements ActionListener {
    private Pedido pedido;
    private Dimension dFrame;
    private Dimension dLabel;
    private Dimension dTextField;
    private Dimension dButton;
    private Dimension dTblItens;

    private Label lblNumPedido;
    private TextField txtNumPedido;

    private Label lblData;
    private TextField txtData;

    private Label lblValorTotal;
    private TextField txtValorTotal;

    private JTable jTblItens;

    private Button cmdAdicionar;
    private Button cmdFecharPedido;

    public PedidoView() {
        dFrame = new Dimension(350, 400);
        dLabel = new Dimension(40, 20);
        dTextField = new Dimension(150, 20);
        dButton = new Dimension(95, 20);
        dTblItens = new Dimension (150,250);

        this.setSize(dFrame);

        lblNumPedido = new Label("Código Produto: ");
        lblNumPedido.setSize(dLabel);
        lblNumPedido.setLocation(25, 50);
        this.add(lblNumPedido);

        txtNumPedido = new TextField();
        txtNumPedido.setSize(dTextField);
        txtNumPedido.setLocation(75, 50);
        this.add(txtNumPedido);

        lblData = new Label("Código Produto: ");
        lblData.setSize(dLabel);
        lblData.setLocation(25, 50);
        this.add(lblData);

        txtData = new TextField();
        txtData.setSize(dTextField);
        txtData.setLocation(75, 50);
        this.add(txtData);

        lblValorTotal = new Label("Código Produto: ");
        lblValorTotal.setSize(dLabel);
        lblValorTotal.setLocation(25, 50);
        this.add(lblValorTotal);

        txtValorTotal = new TextField();
        txtValorTotal.setSize(dTextField);
        txtValorTotal.setLocation(75, 50);
        this.add(txtValorTotal);

        this.cmdAdicionar = new Button("Adicionar");
        this.cmdAdicionar.setSize(dButton);
        this.cmdAdicionar.setLocation(0,0);
        this.cmdAdicionar.addActionListener(this);
        this.add(cmdAdicionar);

        this.cmdFecharPedido = new Button("Fechar Pedido");
        this.cmdFecharPedido.setSize(dButton);
        this.cmdFecharPedido.setLocation(0,0);
        this.cmdFecharPedido.addActionListener(this);
        this.add(cmdFecharPedido);

        jTblItens = new JTable();
        this.jTblItens.setSize(dTblItens);
        this.jTblItens.setLocation(0,0);
        this.add(jTblItens);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cmdAdicionar) {


        }
        if (e.getSource() == cmdFecharPedido) {

        }
    }
}
