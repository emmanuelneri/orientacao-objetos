package br.com.emmanuelneri.heranca.exercicios.exercicio2;

public class TesteExercicio2 {

    public static void main(String args[]) {

        calcularArea(new Circulo(10));
        calcularArea(new Quadrado(10, 2));

    }

    public static double calcularArea(Figura figura) {
        return figura.calcularArea();
    }

}
