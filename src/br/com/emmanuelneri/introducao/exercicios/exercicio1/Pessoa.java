package br.com.emmanuelneri.introducao.exercicios.exercicio1;

//Crie uma classe que represente um objeto com pelo menos 7 atributos e 4 métodos;
public class Pessoa {

    private String nome;
    private String sobrenome;
    private String cpf;
    private String telefone;
    private String endereco;
    private int idade;
    private int salario;

    public boolean maiorIdade() {
        return idade >= 18;
    }

    public boolean validaCpf() {
        return cpf != null && cpf.length() == 11;
    }

    public String nomeCompleto() {
        return nome + " " + sobrenome;
    }

    public double salarioLiquido() {
        return salario - (salario * 0.08);
    }



}