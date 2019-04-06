package br.com.emmanuelneri.exercicio.locadora;

public class Cliente extends Pessoa {

    private String email;
    private String telefone;

    public Cliente(String nome, String cpf, String email, String telefone) {
        super(nome, cpf);
        this.email = email;
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }
}
