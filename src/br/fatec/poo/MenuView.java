package br.fatec.poo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

public class MenuView extends JFrame implements ActionListener {
    private Button cmdProduto;
    private Button cmdPedido;
    private Button cmdSair;

    private Dimension dFrame;
    private Dimension dButton;

    public MenuView(){
        this.dFrame = new Dimension(350, 400);
        this.dButton = new Dimension(95,20);

        this.setSize(dFrame);

        this.cmdProduto = new Button("Produto");
        this.cmdProduto.setSize(dButton);
        this.cmdProduto.setLocation(0,0);
        this.cmdProduto.addActionListener(this);
        this.add(cmdProduto);

        this.cmdPedido = new Button("Pedido");
        this.cmdPedido.setSize(dButton);
        this.cmdPedido.setLocation(0,40);
        this.cmdPedido.addActionListener(this);
        this.add(cmdPedido);

        this.cmdSair = new Button("Sair");
        this.cmdSair.setSize(dButton);
        this.cmdSair.setLocation(0,80);
        this.cmdSair.addActionListener(this);
        this.add(cmdSair);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cmdProduto) {
            new ProdutosView().setVisible(true);
            this.dispose();
        }
        if (e.getSource() == cmdPedido) {
            new PedidoView().setVisible(true);
            this.dispose();
        }
        if (e.getSource() == cmdSair) {
            System.exit(0);
        }
    }
}
