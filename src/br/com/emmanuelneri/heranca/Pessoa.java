package br.com.emmanuelneri.heranca;

public abstract class Pessoa {

    private final String nome;

    public Pessoa(final String nome) {
        this.nome = nome;
    }

    public void ouvir() {
        System.out.println("Ouvir da Pessoa");
    }

    public abstract void falar();

    public String getNome() {
        return this.nome;
    }

   
}
