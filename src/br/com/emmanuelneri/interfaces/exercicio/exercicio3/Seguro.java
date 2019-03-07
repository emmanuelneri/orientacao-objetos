package br.com.emmanuelneri.interfaces.exercicio.exercicio3;

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

    @Override
    public double calcularImposto() {
        return 0;
    }

    @Override
    public void imprmirImposto() {

    }
}
