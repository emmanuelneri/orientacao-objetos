package br.com.emmanuelneri.heranca.exercicios.exercicio3;

import java.util.ArrayList;
import java.util.List;

//Criar uma hierarquia de classes relacionados ao contexto pessoa (Cliente, Fornecedor, etc) e criar um programa que imprima o nome completo de todas pessoas de uma lista independente da subclasse
public class TesteExercicio3 {

    public static void main(String args[]) {

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Vendedor("Vendedor", "1"));
        pessoas.add(new Vendedor("Vendedor", "2"));
        pessoas.add(new Fornecedor("Fornecedor", "1"));

        for(Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNomeCompleto());
        }
    }

}
