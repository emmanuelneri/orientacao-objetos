package br.com.emmanuelneri.trabalho.transportadora;

import java.math.BigDecimal;

public class Produto {
    private String nome;
    private BigDecimal peso;
    private String codigo;

    public Produto(String nome, BigDecimal peso, String codigo){
        this.nome = nome;
        this.peso = peso;
        this.codigo = codigo;

    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public String getCodigo() {
        return codigo;
    }
}
