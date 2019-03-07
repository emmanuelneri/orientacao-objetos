package br.com.emmanuelneri.polimorfismo.pessoa;

public abstract class Pessoa {

    private String nome;
    private String sobrenome;

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNomeCompleto() {
        return nome + " " + sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pessoa{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", sobrenome='").append(sobrenome).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
