package br.com.emmanuelneri.interfaces.exercicio.exercicio4;

public class Empresa implements Entidade {

    private String cnpj;
    private String nome;

    public Empresa(String cnpj, String nome) {
        this.cnpj = cnpj;
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getChave() {
        return cnpj;
    }
}
