package br.com.emmanuelneri.trabalho.pedidos;

import java.math.BigDecimal;

public abstract class Pedido {


    private Produto produto;
    private int quantidade;

    public Pedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public BigDecimal getValorTotal(){
        return produto.getValor().multiply(BigDecimal.valueOf(quantidade));
    }
}

