package br.com.emmanuelneri.exercicio.locadora;

import br.com.emmanuelneri.exercicio.locadora.exception.VeiculoIndisponivelException;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Aluguel {

    private Veiculo veiculo;
    private Cliente cliente;
    private LocalDate dataReserva = LocalDate.now();
    private LocalDate dataRetirada;
    private LocalDate dataDevolucao;

    public Aluguel(Veiculo veiculo, Cliente cliente, LocalDate dataRetirada, LocalDate dataDevolucao) {
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
        validaVeiculo();
        indisponibilizaVeiculo();
    }

    protected BigDecimal calcularValor(LocalDate dataFim) {
        long quantidadeDeDias = ChronoUnit.DAYS
                .between(getDataRetirada(), dataFim);

        return getVeiculo().getValorDiaria()
                .multiply(BigDecimal.valueOf(quantidadeDeDias));
    }

    private void validaVeiculo() {
        if(!veiculo.isDisponivel()) {
            throw new VeiculoIndisponivelException();
        }
    }

    private void indisponibilizaVeiculo() {
        veiculo.indisponibilizar();
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getDataReserva() {
        return dataReserva;
    }

    public LocalDate getDataRetirada() {
        return dataRetirada;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

}
