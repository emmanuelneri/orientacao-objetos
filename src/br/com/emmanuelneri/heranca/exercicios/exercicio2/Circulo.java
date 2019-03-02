package br.com.emmanuelneri.heranca.exercicios.exercicio2;

public class Circulo extends Figura {

    private static final double PI = 3.14;
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return PI * (raio * raio);
    }
}
