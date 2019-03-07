package br.com.emmanuelneri.polimorfismo.exercicio1;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(String numero) {
        super(numero);
    }

    @Override
    protected void aplicarJuro(double valor) {
        this.saldo = this.saldo + (valor * 0.0001);
    }

}
