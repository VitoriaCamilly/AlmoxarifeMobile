package com.example.myapplication.ui.model;

public enum Status {
    AGUARDANDO("Aguardando Entrega"), //0
    DEVOLVIDO("Devolvido"), //1
    ENTREGUE("Entregue"); //2
    String status;

    Status(String devolvido) {
    }
}
