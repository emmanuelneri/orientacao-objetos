package br.com.emmanuelneri.encapsulamento.exercicios.exercicio1;

public class CalculoDivisao {

    private double x;
    private double y;

    public CalculoDivisao(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calcular() {
        return x / y;
    }


}
