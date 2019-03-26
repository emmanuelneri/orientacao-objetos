package br.com.emmanuelneri.trabalho.pedidos;

public class Cliente extends Pessoa {

    private String cpf;

    public Cliente(String nome, String endereco, String cpf) {
        super(nome, endereco);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

}
