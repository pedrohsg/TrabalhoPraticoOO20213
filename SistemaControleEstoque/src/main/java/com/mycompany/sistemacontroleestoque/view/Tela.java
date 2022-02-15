package com.mycompany.sistemacontroleestoque.view;

/**
 * NOME: Pedro Henrique da Silveira Gonçalves MATRÍCULA: 202035036
 */
import com.mycompany.sistemacontroleestoque.controller.AdicionarProduto;
import com.mycompany.sistemacontroleestoque.controller.AtualizarProduto;
import com.mycompany.sistemacontroleestoque.controller.DadosArquivo;
import com.mycompany.sistemacontroleestoque.controller.RemoverProduto;
import com.mycompany.sistemacontroleestoque.controller.Limpar;
import com.mycompany.sistemacontroleestoque.controller.TratarListaProduto;
import com.mycompany.sistemacontroleestoque.model.Estoque;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;


public class Tela extends JFrame {

    private JPanel painelPrincipal;

    private JList<Estoque> listaProdutos;

    private JTextField jtReferenciaProduto;
    private JTextField jtNomeProduto;
    private JTextField jtFornecedorProduto;
    private JTextField jtQuantidadeProduto;
    private JTextField jtDescricaoProduto;
    private JTextField jtValorProduto;

    private int lastIndex;

    public Tela() {
        super("Controle de Estoque");
        //this.addWindowListener(new DadosArquivo(this) {});
    }

    public void desenha() {

        this.setSize(400, 300);
        this.setVisible(true);

        this.painelPrincipal = new JPanel();
        this.painelPrincipal.setLayout(new BorderLayout());

        desenhaMenu();

        desenhaFormulario();

        this.add(this.painelPrincipal);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        this.repaint();
    }

    private void desenhaMenu() {

        JPanel painelMenu;
        painelMenu = new JPanel();
        painelMenu.setBorder(BorderFactory.createTitledBorder("Estoque"));
        this.setLayout(new BorderLayout());
        painelMenu.setPreferredSize(new Dimension(500, 300));

        DefaultListModel<Estoque> model = new DefaultListModel<>();

        listaProdutos = new JList<>(model);
        listaProdutos.setVisible(true);
        listaProdutos.setPreferredSize(new Dimension(400, 400));
        listaProdutos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        listaProdutos.addListSelectionListener(new TratarListaProduto(this));

        painelMenu.add(new JScrollPane(listaProdutos), BorderLayout.EAST);

        this.painelPrincipal.add(painelMenu, BorderLayout.SOUTH);
    }

    private void desenhaFormulario() {

        JPanel painelFormulario;
        painelFormulario = new JPanel();
        painelFormulario.setBorder(BorderFactory.createTitledBorder("Informações"));
        painelFormulario.setLayout(new GridLayout(0, 2));

        JLabel jlReferenciaProduto = new JLabel("Referencia: ");
        jtReferenciaProduto = new JTextField(10);
        painelFormulario.add(jlReferenciaProduto);
        painelFormulario.add(jtReferenciaProduto);

        JLabel jlNomeProduto = new JLabel("Nome: ");
        jtNomeProduto = new JTextField(10);
        painelFormulario.add(jlNomeProduto);
        painelFormulario.add(jtNomeProduto);

        JLabel jlFornecedorProduto = new JLabel("Fornecedor: ");
        jtFornecedorProduto = new JTextField(10);
        painelFormulario.add(jlFornecedorProduto);
        painelFormulario.add(jtFornecedorProduto);

        JLabel jlQuantidadeProduto = new JLabel("Quantidade: ");
        jtQuantidadeProduto = new JTextField(10);
        painelFormulario.add(jlQuantidadeProduto);
        painelFormulario.add(jtQuantidadeProduto);

        JLabel jlDescricaoProduto = new JLabel("Descricao: ");
        jtDescricaoProduto = new JTextField(10);
        painelFormulario.add(jlDescricaoProduto);
        painelFormulario.add(jtDescricaoProduto);

        JLabel jlValorProduto = new JLabel("Valor: ");
        jtValorProduto = new JTextField(10);
        painelFormulario.add(jlValorProduto);
        painelFormulario.add(jtValorProduto);

        JButton btnAdicionar = new JButton("Adicionar");
        btnAdicionar.addActionListener(new AdicionarProduto(this));
        painelFormulario.add(btnAdicionar);

        JButton btnAtualizar = new JButton("Atualizar");
        btnAtualizar.addActionListener(new AtualizarProduto(this));
        painelFormulario.add(btnAtualizar);

        JButton btnRemover = new JButton("Remover");
        btnRemover.addActionListener(new RemoverProduto(this));
        painelFormulario.add(btnRemover);

        JButton btnLimpar = new JButton("Limpar");
        btnLimpar.addActionListener(new Limpar(this));
        painelFormulario.add(btnLimpar);

        this.painelPrincipal.add(painelFormulario, BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        Tela tela = new Tela();

        tela.desenha();
        tela.pack();
    }

    public JList<Estoque> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(JList<Estoque> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public JTextField getJtReferenciaProduto() {
        return jtReferenciaProduto;
    }

    public void setJtReferenciaProduto(JTextField jtReferenciaProduto) {
        this.jtReferenciaProduto = jtReferenciaProduto;
    }

    public JTextField getJtNomeProduto() {
        return jtNomeProduto;
    }

    public void setJtNomeProduto(JTextField jtNomeProduto) {
        this.jtNomeProduto = jtNomeProduto;
    }

    public JTextField getJtFornecedorProduto() {
        return jtFornecedorProduto;
    }

    public void setJtFornecedorProduto(JTextField jtFornecedorProduto) {
        this.jtFornecedorProduto = jtFornecedorProduto;
    }

    public JTextField getJtQuantidadeProduto() {
        return jtQuantidadeProduto;
    }

    public void setJtQuantidadeProduto(JTextField jtQuantidadeProduto) {
        this.jtQuantidadeProduto = jtQuantidadeProduto;
    }

    public JTextField getJtDescricaoProduto() {
        return jtDescricaoProduto;
    }

    public void setJtDescricaoProduto(JTextField jtDescricaoProduto) {
        this.jtDescricaoProduto = jtDescricaoProduto;
    }

    public JTextField getJtValorProduto() {
        return jtValorProduto;
    }

    public void setJtValorProduto(JTextField jtValorProduto) {
        this.jtValorProduto = jtValorProduto;
    }

    public int getLastIndex() {
        return lastIndex;
    }

    public void setLastIndex(int lastIndex) {
        this.lastIndex = lastIndex;
    }

}
