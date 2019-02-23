package br.com.emmanuelneri.encapsulamento;

public class TestePessoa {

    public static class Teste {
        public static void main(String args[]) {
            Pessoa pessoa = new Pessoa("Nome");
            System.out.println(pessoa.getNome());
        }
    }
}
