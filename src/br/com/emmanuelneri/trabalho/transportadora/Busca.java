package br.com.emmanuelneri.trabalho.transportadora;

public class Busca {
    private Transportadora transportadora;
    private Produto produto;
    private Cliente cliente;

    public Busca(Transportadora transportadora) {
        this.transportadora = transportadora;
    }

    public void buscar(Cliente cliente, Produto produto){
        this.cliente = cliente;
        this.produto = produto;
    }

    public Transportadora getTransportadora() {
        return transportadora;
    }

    public Produto getProduto() {
        return produto;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
