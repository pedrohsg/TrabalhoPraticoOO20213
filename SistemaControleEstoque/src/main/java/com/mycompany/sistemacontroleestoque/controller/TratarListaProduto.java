
package com.mycompany.sistemacontroleestoque.controller;

/**
 * NOME: Pedro Henrique da Silveira Gonçalves
 * MATRÍCULA: 202035036
 */

import com.mycompany.sistemacontroleestoque.model.Estoque;
import com.mycompany.sistemacontroleestoque.view.Tela;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class TratarListaProduto implements ListSelectionListener{

    private final Tela tela;

    public TratarListaProduto(Tela tela) {
        this.tela = tela;
    }
    
    @Override
    public void valueChanged(ListSelectionEvent e) {
    
        int index;
        index = tela.getListaProdutos().getSelectedIndex();
        
        if(index != -1){
            Estoque estoque = tela.getListaProdutos().getModel().getElementAt(index);
            
            tela.getJtReferenciaProduto().setText(estoque.getReferenciaProduto());
            tela.getJtNomeProduto().setText(estoque.getNomeProduto());
            tela.getJtFornecedorProduto().setText(estoque.getFornecedorProduto());
            tela.getJtQuantidadeProduto().setText(estoque.getQuantidadeProduto());
            tela.getJtDescricaoProduto().setText(estoque.getDescricaoProduto());
            tela.getJtValorProduto().setText(estoque.getValorProduto());

            tela.setLastIndex(index);
            
        }
    }
    
}