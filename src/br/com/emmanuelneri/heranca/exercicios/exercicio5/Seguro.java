package br.com.emmanuelneri.heranca.exercicios.exercicio5;

public abstract class Seguro extends Servico {

    private String apolice;

    public Seguro(Cliente cliente, String nome, double valor) {
        super(cliente, nome, valor);
    }

    public String getApolice() {
        return apolice;
    }

    public void setApolice(String apolice) {
        this.apolice = apolice;
    }
}
