package br.com.emmanuelneri.encapsulamento.exercicios.exercico3;

public class ItemPedido {

    private String produto;
    private int valor;

    public ItemPedido(String produto, int valor) {
        this.produto = produto;
        this.valor = valor;
    }

    public ItemPedido(String produto) {
        this(produto, 0);
    }

}
