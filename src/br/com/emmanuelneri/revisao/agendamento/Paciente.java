package br.com.emmanuelneri.revisao.agendamento;

import java.time.LocalDate;

public class Paciente extends Pessoa {

    private String cpf;
    private LocalDate dataNascimento;
    private String endereco;

    public Paciente(String nome, String telefone, String cpf, LocalDate dataNascimento, String endereco) {
        super(nome, telefone);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }
}
