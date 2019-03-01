package br.com.emmanuelneri.heranca;

public class Vendedor extends Pessoa {

    public Vendedor(String nome) {
        super(nome);
    }

    @Override
    public void falar() {

    }

    public void vender() {
        System.out.println("vender");
    }
}
