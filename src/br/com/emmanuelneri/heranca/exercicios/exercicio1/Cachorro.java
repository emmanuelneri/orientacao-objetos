package br.com.emmanuelneri.heranca.exercicios.exercicio1;

public abstract class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }

    public void latir() {
        System.out.println("Latir");
    }

}
