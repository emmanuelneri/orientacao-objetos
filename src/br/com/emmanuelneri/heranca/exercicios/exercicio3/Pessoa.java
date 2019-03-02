package br.com.emmanuelneri.heranca.exercicios.exercicio3;

public abstract class Pessoa {

    private String nome;
    private String sobrenome;

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNomeCompleto() {
        return nome + " " + sobrenome;
    }
}
