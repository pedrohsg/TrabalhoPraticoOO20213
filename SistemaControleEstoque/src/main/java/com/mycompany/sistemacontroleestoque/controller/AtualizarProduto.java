
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


public class AtualizarProduto implements ActionListener{

    private final Tela tela;

    public AtualizarProduto(Tela tela) {
        this.tela = tela;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        DefaultListModel<Estoque> modelo = (DefaultListModel<Estoque>) tela.getListaProdutos().getModel();
        Estoque estoque = modelo.getElementAt(tela.getLastIndex());
        
        estoque.setReferenciaProduto(tela.getJtReferenciaProduto().getText());
        estoque.setNomeProduto(tela.getJtNomeProduto().getText());
        estoque.setFornecedorProduto(tela.getJtFornecedorProduto().getText());
        estoque.setQuantidadeProduto(tela.getJtQuantidadeProduto().getText());
        estoque.setDescricaoProduto(tela.getJtDescricaoProduto().getText());
        estoque.setValorProduto(tela.getJtValorProduto().getText());

        
        tela.repaint();
    }
    
    
}