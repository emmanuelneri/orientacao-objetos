package br.com.emmanuelneri.polimorfismo.tipopessoa;

public class TesteTipoPessoa {

    public double calcularDescontoComPolimorfismo(TipoPessoa tipoPessoa, double valor) {
        return tipoPessoa.calcularDesconto(valor);
    }

    public double calcularDescontoSemPolimorfismo(TipoPessoa tipoPessoa, double valor) {
        if(tipoPessoa == TipoPessoa.FISICA) {
            return valor - (valor * 0.10);
        }

        if(tipoPessoa == TipoPessoa.JURIDICA ) {
            return valor - (valor * 0.15);
        }

        return 0;
    }

}
