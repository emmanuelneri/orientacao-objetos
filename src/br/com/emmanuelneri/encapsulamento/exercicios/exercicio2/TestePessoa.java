package br.com.emmanuelneri.encapsulamento.exercicios.exercicio2;

public class TestePessoa {

    public static void main(String args[]) {
        Pessoa pessoa = new Pessoa("123321", "3213123");
        System.out.println(pessoa.getCpf());
        System.out.println(pessoa.getRg());
    }

}
