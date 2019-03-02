package br.com.emmanuelneri.heranca.exercicios.exercicio1;

public class TesteExercicio1 {

    public static void main(String[] args) {
        Animal dogGenerico = new Pug("Pug genérico");
        Cachorro dogIntermediario = new Pug("Pug cachorro");
        Pug dogEspecifico = new Pug("Pug específico");
    }

}

