
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

public class RemoverProduto implements ActionListener {

    private final Tela tela;

    public RemoverProduto(Tela tela) {
        this.tela = tela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int selectedIndex = tela.getListaProdutos().getSelectedIndex();

        if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(tela, "Selecione um produto a ser removido!");
        } else {
            DefaultListModel<Estoque> modelo = (DefaultListModel<Estoque>) tela.getListaProdutos().getModel();

            modelo.removeElementAt(selectedIndex);
            tela.getListaProdutos().setModel(modelo);
            tela.repaint();
        }

    }

}