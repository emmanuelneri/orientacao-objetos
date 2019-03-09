package br.com.emmanuelneri.excecoes.exercicio1;

public class Bilheteria {

    private int quantidadeIngressos;
    private int quantidadePessoas;

    public Bilheteria(int quantidadeIngresso, int quantidadePessoas) {
        this.quantidadeIngressos = quantidadeIngresso;
        this.quantidadePessoas = quantidadePessoas;
    }

    public int divisao() {
        try {
            return quantidadePessoas / quantidadeIngressos;
        } catch (ArithmeticException aex) {
            throw new DivisaoPorZeroException();
        }
    }
}
