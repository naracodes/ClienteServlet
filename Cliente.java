package br.com.polotech925.hellowordservlet;

import java.math.BigDecimal;

public interface Cliente {
        void cadastrar(String nome, BigDecimal cpf);
        String tipoConta();
}
