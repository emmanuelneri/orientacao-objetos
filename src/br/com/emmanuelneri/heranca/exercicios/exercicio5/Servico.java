package br.com.emmanuelneri.heranca.exercicios.exercicio5;

public abstract class Servico {

    private Cliente cliente;
    private String nome;
    private double valor;

    public Servico(Cliente cliente, String nome, double valor) {
        this.cliente = cliente;
        this.nome = nome;
        this.valor = valor;
    }
}
