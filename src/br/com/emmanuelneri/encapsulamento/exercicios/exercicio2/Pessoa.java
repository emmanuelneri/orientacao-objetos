package br.com.emmanuelneri.encapsulamento.exercicios.exercicio2;

public class Pessoa {

    private String cpf;
    private String rg;

    public Pessoa(String cpf, String rg) {
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }
}
