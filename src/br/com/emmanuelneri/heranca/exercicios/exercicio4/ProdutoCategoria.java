package br.com.emmanuelneri.heranca.exercicios.exercicio4;

public abstract class ProdutoCategoria extends Produto {

    protected String categoria;

    public ProdutoCategoria(String nome, double preco, String categoria) {
        super(nome, preco);
        this.categoria = categoria;
    }
}
