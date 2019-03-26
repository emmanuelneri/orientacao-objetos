package br.com.emmanuelneri.trabalho.transportadora;

public class Endereco {
    private String logradouro;
    private String cep;
    private Cidade cidade;

    public Endereco(String logradouro, String cep, Cidade cidade) {
        this.logradouro = logradouro;
        this.cep = cep;
        this.cidade = cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getCep() {
        return cep;
    }

    public Cidade getCidade() {
        return cidade;
    }
}
