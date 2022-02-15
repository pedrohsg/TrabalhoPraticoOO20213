/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacontroleestoque.controller;

/**
 * NOME: Pedro Henrique da Silveira Gonçalves
 * MATRÍCULA: 202035036
 */

import com.mycompany.sistemacontroleestoque.view.Tela;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Limpar implements ActionListener{
    
    private final Tela tela;

    public Limpar(Tela tela) {
        this.tela = tela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        tela.getJtReferenciaProduto().setText("");
        tela.getJtNomeProduto().setText("");
        tela.getJtFornecedorProduto().setText("");
        tela.getJtQuantidadeProduto().setText("");
        tela.getJtDescricaoProduto().setText("");
        tela.getJtValorProduto().setText("");
        
        tela.repaint();
    }
    
    
    
}