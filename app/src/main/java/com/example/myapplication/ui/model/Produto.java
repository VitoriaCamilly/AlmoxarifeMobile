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
}
