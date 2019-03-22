package br.com.emmanuelneri.interfaces.desconto;

public class DescontoProduto implements Desconto {

    private static final double DESCONTO_PRODUTO = 0.05;

    @Override
    public Double calcular(double valor) {
        return valor * DESCONTO_PRODUTO;
    }
}
