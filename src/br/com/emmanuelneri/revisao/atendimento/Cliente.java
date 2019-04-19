package br.com.emmanuelneri.revisao.atendimento;

import java.time.LocalDate;

public class Cliente extends Pessoa {

    private String cpfCnpj;
    private TipoCliente tipo;
    private String telefone;
    private LocalDate dataNascimento;
    private Endereco endereco;

    public Cliente(String nome, String cpfCnpj, TipoCliente tipo, String telefone, LocalDate dataNascimento, Endereco endereco) {
        super(nome);
        this.cpfCnpj = cpfCnpj;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public TipoCliente getTipo() {
        return tipo;
    }

    public String getTelefone() {
        return telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}
