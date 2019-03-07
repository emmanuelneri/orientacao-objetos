package br.com.emmanuelneri.interfaces.exercicio.exercicio1;

import br.com.emmanuelneri.interfaces.exercicio.exercico2.FormaGeometrica;

public class Quadrado implements Figura, FormaGeometrica {

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

    @Override
    public void imprimirNome() {
        System.out.println("Quadrado");
    }
}
