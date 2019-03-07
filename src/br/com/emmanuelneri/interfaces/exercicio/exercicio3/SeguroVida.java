package br.com.emmanuelneri.interfaces.exercicio.exercicio3;

public class SeguroVida extends Seguro {

    private Pessoa pessoa;

    public SeguroVida(Cliente cliente, String nome, double valor, Pessoa pessoa) {
        super(cliente, nome, valor);
        this.pessoa = pessoa;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

}
