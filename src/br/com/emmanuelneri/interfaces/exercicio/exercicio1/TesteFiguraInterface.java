package br.com.emmanuelneri.interfaces.exercicio.exercicio1;

public class TesteFiguraInterface {

    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(10, 2);
        Circulo circulo = new Circulo(10);

        quadrado.calcularArea();
        quadrado.imprimirNome();

        circulo.calcularArea();
        circulo.imprimirNome();

    }

}
