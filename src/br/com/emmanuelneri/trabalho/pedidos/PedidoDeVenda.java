package br.com.emmanuelneri.trabalho.pedidos;


import java.util.Date;

public class PedidoDeVenda extends Pedido{
    private Cliente cliente;
    private Date  dataSaida;

    public PedidoDeVenda(Produto produto, int quantidade, Cliente cliente) {
        super(produto, quantidade);
        this.cliente = cliente;
    }
        public void fecharPedido (){
        dataSaida = new Date();
        }
}
