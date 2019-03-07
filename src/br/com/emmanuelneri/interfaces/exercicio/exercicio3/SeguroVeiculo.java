package br.com.emmanuelneri.interfaces.exercicio.exercicio3;

public class SeguroVeiculo extends Seguro {

    private Veiculo veiculo;

    public SeguroVeiculo(Cliente cliente, String nome, double valor, Veiculo veiculo) {
        super(cliente, nome, valor);
        this.veiculo = veiculo;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

}
