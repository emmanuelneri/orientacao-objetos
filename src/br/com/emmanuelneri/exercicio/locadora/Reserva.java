package br.com.emmanuelneri.exercicio.locadora;

import br.com.emmanuelneri.exercicio.locadora.exception.VeiculoIndisponivelException;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Reserva extends Aluguel {

    public Reserva(Veiculo veiculo, Cliente cliente, LocalDate dataRetirada, LocalDate dataDevolucao) {
        super(veiculo, cliente, dataRetirada, dataDevolucao);
    }

    public BigDecimal reservar() {
        return calcularValor(getDataDevolucao());
    }
}
