package br.com.emmanuelneri.heranca.exercicios.exercicio5;

public class Emprestimo extends Servico {

    private double credito;

    public Emprestimo(Cliente cliente, String nome, double valor) {
        super(cliente, nome, valor);
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}
