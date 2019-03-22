package br.com.emmanuelneri.interfaces.desconto;

public class DescontoEspecial implements Desconto {

    private static final double DESCONTO_ESPECIAL = 0.15;

    @Override
    public Double calcular(double valor) {
        return valor * DESCONTO_ESPECIAL;
    }
}
