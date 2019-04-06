package br.com.emmanuelneri.exercicio.locadora;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Locacao extends Aluguel {

    private BigDecimal quilometragemInicial;
    private BigDecimal valorTotal = BigDecimal.ZERO;
    private StatusLocacao status = StatusLocacao.ABERTA;
    private Entrega entrega;

    public Locacao(Veiculo veiculo, Cliente cliente, LocalDate dataRetirada, LocalDate dataDevolucao, BigDecimal quilometragemInicial) {
        super(veiculo, cliente, dataRetirada, dataDevolucao);
        this.quilometragemInicial = quilometragemInicial;
    }

    public static Locacao criarAPartirDaReserva(Reserva reserva) {
        Veiculo veiculo = reserva.getVeiculo();
        veiculo.disponibilizar();
        return new Locacao(veiculo,
                reserva.getCliente(),
                reserva.getDataRetirada(),
                reserva.getDataDevolucao(),
                veiculo.getQuilometragem());
    }

    public void fechar(BigDecimal quilometragemFinal, Funcionario funcionario, LocalDate dataEntrega) {
        if(this.status != StatusLocacao.ABERTA) {
            throw new StatusInvalidoException(
                    "Locação não pode ser fechada");
        }

        this.status = StatusLocacao.FECHADA;
        this.entrega = new Entrega(quilometragemFinal, dataEntrega, funcionario);
        this.valorTotal = calcularValor(entrega.getDataEntrega());
        getVeiculo().disponibilizar(quilometragemFinal);
    }

    public void cancelar() {
        if(this.status == StatusLocacao.FECHADA) {
            throw new StatusInvalidoException(
                    "Locação já está fechada");
        }

        this.status = StatusLocacao.CANCELADA;
        getVeiculo().disponibilizar();
    }

    public StatusLocacao getStatus() {
        return status;
    }

    public Entrega getEntrega() {
        return entrega;
    }
}
