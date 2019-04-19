package br.com.emmanuelneri.revisao.atendimento;

public class Atendente extends Pessoa {

    private String cpf;
    private String email;

    public Atendente(String nome, String nome1, String cpf, String email) {
        super(nome);
        this.cpf = cpf;
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }
}
