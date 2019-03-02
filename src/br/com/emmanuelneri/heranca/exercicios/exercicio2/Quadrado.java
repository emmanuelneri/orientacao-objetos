package br.com.emmanuelneri.heranca.exercicios.exercicio2;

public class Quadrado extends Figura {

    private double base;
    private double altura;

    public Quadrado(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}
