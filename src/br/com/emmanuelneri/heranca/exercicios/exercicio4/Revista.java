package br.com.emmanuelneri.heranca.exercicios.exercicio4;

public class Revista extends ProdutoCategoria {

    private String edicao;

    public Revista(String nome, double preco, String categoria, String edicao) {
        super(nome, preco, categoria);
        this.edicao = edicao;
    }

    @Override
    public String toString() {
        return "Revista {" +
                "nome='" + getNome() + '\'' +
                "preco='" + getPreco() + '\'' +
                "categoria='" + categoria + '\'' +
                "edição='" + edicao + '\'' +
                '}';
    }
}
