package br.com.emmanuelneri.polimorfismo.pessoa;

public class Fornecedor extends Pessoa {

    private String especialidade;

    public Fornecedor(String nome, String sobrenome, String especialidade) {
        super(nome, sobrenome);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    @Override
    public String toString() {
        final StringBuffer toString = new StringBuffer("Fornecedor{");
        toString.append("nome='").append(getNome()).append('\'');
        toString.append(", sobrenome='").append(getSobrenome()).append('\'');
        toString.append(", especialidade='").append(especialidade).append('\'');
        toString.append('}');
        return toString.toString();
    }
}
