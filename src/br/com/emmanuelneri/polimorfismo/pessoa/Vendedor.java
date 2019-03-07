package br.com.emmanuelneri.polimorfismo.pessoa;

public class Vendedor extends Pessoa {

    private String departamento;

    public Vendedor(String nome, String sobrenome, String departamento) {
        super(nome, sobrenome);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public String toString() {
        final StringBuffer toString = new StringBuffer("Vendedor{");
        toString.append("nome='").append(getNome()).append('\'');
        toString.append(", sobrenome='").append(getSobrenome()).append('\'');
        toString.append(", departamento='").append(departamento).append('\'');
        toString.append('}');
        return toString.toString();
    }
}
