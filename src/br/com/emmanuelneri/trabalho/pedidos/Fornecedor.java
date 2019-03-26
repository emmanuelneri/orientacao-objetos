package br.com.emmanuelneri.trabalho.pedidos;

public class Fornecedor extends Pessoa {

    private String cnpj;

    public Fornecedor(String nome, String endereco, String cnpj) {
        super(nome, endereco);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }
}
