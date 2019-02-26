package br.com.emmanuelneri.constantes.exercicios;

public class Produto {

    private String descricao;
    private Cliente cliente;
    private double preco;

    public Produto(Cliente cliente, double preco) {
        this.cliente = cliente;
        this.preco = preco;
    }

    public double retornaPreco() {
        if(cliente.getTipo() == TipoCliente.FISICA) {
            return this.preco * 0.9;
        }

        if(cliente.getTipo() == TipoCliente.JURIDICA) {
            return this.preco * 0.85;
        }

        if(cliente.getTipo() == TipoCliente.ESPECIAL) {
            return this.preco * 0.7;
        }

        return preco;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
