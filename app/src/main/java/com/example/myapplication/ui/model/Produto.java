package com.example.myapplication.ui.model;

import java.util.List;

public class Produto {

    private Integer codigo;
    private Integer quantidadeTotal;
    private Integer quantidadeReservada;
    private String nome;
    private OpcaoUso opcaoUso;
    private String descricao;
    private String imagem;
    private List<Localizacao> localizacoes;
    private Classificacao classificacao;

    public Produto(int codigo,int quantidadeTotal,String nome, Classificacao classificacacao){
        this.codigo = codigo;
        this.quantidadeTotal = quantidadeTotal;
        this.nome = nome;
        this.classificacao = classificacacao;
    }




    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getQuantidadeTotal() {
        return quantidadeTotal;
    }

    public void setQuantidadeTotal(Integer quantidadeTotal) {
        this.quantidadeTotal = quantidadeTotal;
    }

    public Integer getQuantidadeReservada() {
        return quantidadeReservada;
    }

    public void setQuantidadeReservada(Integer quantidadeReservada) {
        this.quantidadeReservada = quantidadeReservada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public OpcaoUso getOpcaoUso() {
        return opcaoUso;
    }

    public void setOpcaoUso(OpcaoUso opcaoUso) {
        this.opcaoUso = opcaoUso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public List<Localizacao> getLocalizacoes() {
        return localizacoes;
    }

    public void setLocalizacoes(List<Localizacao> localizacoes) {
        this.localizacoes = localizacoes;
    }

    public Classificacao getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }
}
