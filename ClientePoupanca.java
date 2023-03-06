package br.com.polotech925.hellowordservlet;

import java.math.BigDecimal;

public class ClientePoupanca implements Cliente{
    String nome;
    BigDecimal cpf;

    @Override
    public void cadastrar(String nome, BigDecimal cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String tipoConta() {
        return "poupanca";
    }
}
