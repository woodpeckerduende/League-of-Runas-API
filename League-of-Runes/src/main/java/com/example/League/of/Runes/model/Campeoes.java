package com.example.League.of.Runes.model;

public class Campeoes {
    public String nome;

    public String role;

    public String funcao;

    public Campeoes(String nome, String role, String funcao) {
        this.nome = nome;
        this.role = role;
        this.funcao = funcao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

}