package br.com.emmanuelneri.teste;

public class SaldoInsuficienteException extends RuntimeException {

    public SaldoInsuficienteException() {
        super("Saldo insuficiente!");
    }
}
