package br.com.emmanuelneri.heranca.exercicios.exercicio4;

public class Jogo extends ProdutoCategoria {

    public Jogo(String nome, double preco, String categoria) {
        super(nome, preco, categoria);
    }

    @Override
    public String toString() {
        return "Jogo {" +
                "nome='" + getNome() + '\'' +
                "preco='" + getPreco() + '\'' +
                "categoria='" + categoria + '\'' +
                '}';
    }

}
