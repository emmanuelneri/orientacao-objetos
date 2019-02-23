package br.com.emmanuelneri.encapsulamento;

public class Pessoa {

    private String nome;
    private String cpf;

    private Pessoa() {
    }

    public Pessoa(String nome) {
       this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
