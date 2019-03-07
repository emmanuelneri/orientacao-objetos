package br.com.emmanuelneri.polimorfismo.exercicio1;

public abstract class Conta {

    private String numero;
    protected double saldo = 0;

    public Conta(final String numero) {
        this.numero = numero;
    }

    protected void saque(double valor) {
        aplicarJuro(valor);
        this.saldo = this.saldo - valor;
    }

    protected abstract void aplicarJuro(double valor);

    protected void deposito(double valor) {
        this.saldo = this.saldo + valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
