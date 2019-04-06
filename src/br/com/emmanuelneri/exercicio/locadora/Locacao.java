package br.com.emmanuelneri.exercicio.locadora;

import br.com.emmanuelneri.exercicio.locadora.exception.VeiculoIndisponivelException;
import br.com.emmanuelneri.java.Test;

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

    public Locacao(Reserva reserva) {
        this(reserva.getVeiculo(),
                reserva.getCliente(),
                reserva.getDataRetirada(),
                reserva.getDataDevolucao(),
                reserva.getVeiculo().getQuilometragem());
    }

    public void fechar(BigDecimal quilometragemFinal, Funcionario funcionario) {
        if(this.status != StatusLocacao.ABERTA) {
            throw new StatusInvalidoException(
                    "Locação não pode ser fechada");
        }

        this.status = StatusLocacao.FECHADA;
        this.entrega = new Entrega(quilometragemFinal, funcionario);
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
}
