package br.com.emmanuelneri.polimorfismo.exercicio1;

public class ContaCorrente extends Conta {

    public ContaCorrente(String numero) {
        super(numero);
    }

    @Override
    protected void aplicarJuro(double valor) {
    }
}
