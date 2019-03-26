package br.com.emmanuelneri.trabalho.pedidos;

import br.com.emmanuelneri.trabalho.transportadora.Endereco;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class TestPedido {
    @Test
    public void pedidoDeCompraTeste (){
        Produto produto = new Produto("joaninha", BigDecimal.TEN);
        Fornecedor fornecedor = new Fornecedor( "joaquim", "Rua:Jose laguilo 789", "87686553312");
        PedidoDeCompra pedido = new PedidoDeCompra(produto,10, fornecedor);
        Assert.assertEquals(BigDecimal.valueOf(100),pedido.getValorTotal());
    }
}
