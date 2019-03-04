package br.com.emmanuelneri.heranca.exercicios.exercicio2;

//Criar a seguinte hierarquia de classes: Figura, Circulo e Quadrado, onde as subclasses devem calcular a área. (círculo: A=3,14 x raio² | quadrado = base x altura )
public class TesteExercicio2 {

    public static void main(String args[]) {

        calcularArea(new Circulo(10));
        calcularArea(new Quadrado(10, 2));

    }

    public static double calcularArea(Figura figura) {
        return figura.calcularArea();
    }

}
