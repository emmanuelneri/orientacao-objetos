package br.com.emmanuelneri.heranca;

public class Cliente extends Pessoa {

    public Cliente() {
        super("Cliente");
        System.out.println(getNome());
    }

    @Override
    public void falar() {

    }

    public void calcular(Long valor) { }
    public void calcular(Integer valor) { }
}
