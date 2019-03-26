package br.com.emmanuelneri.trabalho.transportadora;

public class Transportadora extends Pessoa {
    private String cnpj;


    public Transportadora(String nome, Endereco endereco, String cnpj) {
        super(nome, endereco);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }
}
