package com.mycompany.sistemacontroleestoque.controller;

/**
 * NOME: Pedro Henrique da Silveira Gonçalves
 * MATRÍCULA: 202035036
 */
import com.mycompany.sistemacontroleestoque.model.Estoque;
import com.mycompany.sistemacontroleestoque.view.Tela;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class AdicionarProduto implements ActionListener {

    private final Tela tela;

    public AdicionarProduto(Tela tela) {
        this.tela = tela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(tela, "Adicionando Produto");

        DefaultListModel<Estoque> model = (DefaultListModel<Estoque>) tela.getListaProdutos().getModel();

        model.addElement(new Estoque(tela.getJtReferenciaProduto().getText(),
                tela.getJtNomeProduto().getText(),
                tela.getJtFornecedorProduto().getText(),
                tela.getJtQuantidadeProduto().getText(),
                tela.getJtDescricaoProduto().getText(),
                tela.getJtValorProduto().getText())
        );

        tela.getListaProdutos().setModel(model);
        tela.repaint();

    }

}
