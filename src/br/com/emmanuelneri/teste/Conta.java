package br.com.emmanuelneri.teste;

public class Conta {

    private Double saldo = 0d;

    public void saque(Double valor) {
        if(this.saldo >= valor) {
            saldo = saldo - valor;
        } else {
            throw new SaldoInsuficienteException();
        }
    }

    public void deposito(Double valor) {
        saldo = saldo + valor;
    }

    public Double getSaldo() {
        return saldo;
    }
}
