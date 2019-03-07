package br.com.emmanuelneri.interfaces.desconto;

public class DecontoProduto implements Desconto {

    private static final double DESCONTO_PRODUTO = 0.05;

    @Override
    public double calcular(double valor) {
        return valor * DESCONTO_PRODUTO;
    }
}
