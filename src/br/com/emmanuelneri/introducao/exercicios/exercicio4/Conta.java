package br.com.emmanuelneri.introducao.exercicios.exercicio4;

//Crie uma classe conta que possibilite as operações de saque e depósito.
public class Conta {

    private double valor = 10;

    public void saque(double valorSaque) {
        valor = valor - valorSaque;
    }

    public void deposito(double valorDeposito) {
        valor = valor + valorDeposito;
    }

    public double consultaSaldo() {
        throw new RuntimeException("erro");
//        return valor;
    }

}
