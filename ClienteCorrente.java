package br.com.polotech925.hellowordservlet;

import br.com.polotech925.hellowordservlet.Cliente;

import java.math.BigDecimal;

public class ClienteCorrente implements Cliente {
    private String nome;
    private BigDecimal cpf;

    private String tipo;

    public void cadastrar(String nome, BigDecimal cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.tipo = "corrente";

    }

    @Override
    public String tipoConta() {
        return "Corrente";
    }
}
