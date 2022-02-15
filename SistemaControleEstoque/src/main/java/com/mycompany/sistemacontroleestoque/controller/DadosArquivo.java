/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacontroleestoque.controller;

/**
 * NOME: Pedro Henrique da Silveira Gonçalves MATRÍCULA: 202035036
 */
import com.mycompany.sistemacontroleestoque.model.Estoque;
import com.mycompany.sistemacontroleestoque.view.Tela;
import com.mycompany.sistemacontroleestoque.controller.utils.Arquivo;
import com.mycompany.sistemacontroleestoque.controller.utils.JSON;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

/**
 *
 * @author pedro
 */
public abstract class DadosArquivo implements WindowListener {

    private static final String CAMINHO = "dados.json";
    private final Tela tela;

    public DadosArquivo(Tela tela) {
        this.tela = tela;
    }

    @Override
    public void windowOpened(WindowEvent e) {

        try {
            String dados = Arquivo.lendoArquivo(CAMINHO);
            List<Estoque> estoques = JSON.toEstoques(dados);

            DefaultListModel<Estoque> modelo = new DefaultListModel<>();

            for (Estoque estoque : estoques) {
                modelo.addElement(estoque);
            }

            tela.getListaProdutos().setModel(modelo);
            tela.repaint();

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(tela, "Não foi possível carregar as informações do estoque!");
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        try {
            ListModel<Estoque> modelo = tela.getListaProdutos().getModel();
            List<Estoque> estoques = new ArrayList<>();

            for (int i = 0; i < modelo.getSize(); i++) {
                estoques.add(modelo.getElementAt(i));
            }

            String toJSON = JSON.toJSON(estoques);

            Arquivo.escrevendoArquivo(CAMINHO, toJSON);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(tela, "Não foi possivel salvar as informações do estoque!");
        }
    }
}
