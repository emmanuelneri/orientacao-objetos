package br.com.emmanuelneri.trabalho.pedidos;

import java.math.BigDecimal;
import java.util.Date;

public class PedidoDeCompra extends Pedido{

    private Fornecedor fornecedor;

    private Date dataEntrada;

    public PedidoDeCompra(Produto produto, int quantidade, Fornecedor fornecedor) {
        super(produto, quantidade);
        this.fornecedor = fornecedor;
    }

    public void fecharPedido() {
        dataEntrada = new Date();
    }

}
