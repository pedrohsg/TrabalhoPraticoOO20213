package com.mycompany.sistemacontroleestoque.model;

/**
 * NOME: Pedro Henrique da Silveira Gonçalves
 * MATRÍCULA: 202035036
 */
public class Estoque {

    private String referenciaProduto;
    private String nomeProduto;
    private String fornecedorProduto;
    private String quantidadeProduto;
    private String descricaoProduto;
    private String valorProduto;

    public Estoque() {
    }

    public Estoque(String referenciaProduto, String nomeProduto, String fornecedorProduto, String quantidadeProduto, String descricaoProduto, String valorProduto) {

        this.referenciaProduto = referenciaProduto;
        this.nomeProduto = nomeProduto;
        this.fornecedorProduto = fornecedorProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.descricaoProduto = descricaoProduto;
        this.valorProduto = valorProduto;
    }

    public String getReferenciaProduto() {
        return referenciaProduto;
    }

    public void setReferenciaProduto(String referenciaProduto) {
        this.referenciaProduto = referenciaProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getFornecedorProduto() {
        return fornecedorProduto;
    }

    public void setFornecedorProduto(String fornecedorProduto) {
        this.fornecedorProduto = fornecedorProduto;
    }

    public String getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(String quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public String getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(String valorProduto) {
        this.valorProduto = valorProduto;
    }

    @Override
    public String toString() {
        return this.referenciaProduto + " " + this.nomeProduto;
    }

}
