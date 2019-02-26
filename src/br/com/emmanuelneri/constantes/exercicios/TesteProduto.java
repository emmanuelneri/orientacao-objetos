package br.com.emmanuelneri.constantes.exercicios;

public class TesteProduto {

    public static void main(String[] args) {
        final Cliente cliente = new Cliente("Cliente", TipoCliente.ESPECIAL);
        final Produto produto = new Produto(cliente, 100);

        System.out.println(produto.retornaPreco());
    }


}
