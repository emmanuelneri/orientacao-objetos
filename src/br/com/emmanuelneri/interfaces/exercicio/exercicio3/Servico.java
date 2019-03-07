package br.com.emmanuelneri.interfaces.exercicio.exercicio3;

public abstract class Servico implements Tributavel {

    private Cliente cliente;
    private String nome;
    private double valor;

    public Servico(Cliente cliente, String nome, double valor) {
        this.cliente = cliente;
        this.nome = nome;
        this.valor = valor;
    }
}
