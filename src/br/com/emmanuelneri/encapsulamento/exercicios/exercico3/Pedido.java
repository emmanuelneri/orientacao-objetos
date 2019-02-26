package br.com.emmanuelneri.encapsulamento.exercicios.exercico3;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private int total = 0;
    private List<ItemPedido> itens;

    public Pedido() {
        this.total = 0;
        this.itens = new ArrayList<>();
    }

    public void adicionaItem(String produto, int valor) {
        final ItemPedido itemPedido = new ItemPedido(produto, valor);
        this.total = this.total + valor;
        this.itens.add(itemPedido);
    }

}
