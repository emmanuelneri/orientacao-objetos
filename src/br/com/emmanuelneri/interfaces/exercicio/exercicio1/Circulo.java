package br.com.emmanuelneri.interfaces.exercicio.exercicio1;

import br.com.emmanuelneri.interfaces.exercicio.exercico2.FormaGeometrica;

public class Circulo implements Figura, FormaGeometrica {

    private static final double PI = 3.14;
    private final double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return PI * (raio * raio);
    }

    @Override
    public void imprimirNome() {
        System.out.println("Circulo");
    }
}
