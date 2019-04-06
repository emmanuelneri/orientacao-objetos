package br.com.emmanuelneri.exercicio.locadora.teste;

import br.com.emmanuelneri.exercicio.locadora.*;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class LocaoTest {

    @Test
    public void criarReserva() {
        Cliente cliente = new Cliente("Joao", "2194894843", "joao@gmail.com", "44929292992");
        Veiculo veiculo = new Veiculo("AAA-1233", "Onix", "LTZ", "Completo", BigDecimal.valueOf(100));
        Reserva reserva = new Reserva(veiculo, cliente, LocalDate.of(2019, 4, 3), LocalDate.of(2019, 4, 8));

        BigDecimal valorPrevistoReserva = reserva.reservar();

        Assert.assertEquals(BigDecimal.valueOf(500), valorPrevistoReserva);
        Assert.assertFalse(veiculo.isDisponivel());
    }

    @Test
    public void criarUmaLocacaoAPartirDeUmaReserva() {
        Cliente cliente = new Cliente("Joao", "2194894843", "joao@gmail.com", "44929292992");
        Veiculo veiculo = new Veiculo("AAA-1233", "Onix", "LTZ", "Completo", BigDecimal.valueOf(100));
        Reserva reserva = new Reserva(veiculo, cliente, LocalDate.of(2019, 4, 3), LocalDate.of(2019, 4, 8));
        Locacao locacao = Locacao.criarAPartirDaReserva(reserva);


        Assert.assertEquals(StatusLocacao.ABERTA, locacao.getStatus());
        Assert.assertNull(locacao.getEntrega());
        Assert.assertFalse(veiculo.isDisponivel());
    }

    @Test
    public void finalizarUmaLocao() {
        Cliente cliente = new Cliente("Joao", "2194894843", "joao@gmail.com", "44929292992");
        Veiculo veiculo = new Veiculo("AAA-1233", "Onix", "LTZ", "Completo", BigDecimal.valueOf(100));
        Reserva reserva = new Reserva(veiculo, cliente, LocalDate.of(2019, 4, 3), LocalDate.of(2019, 4, 8));
        Locacao locacao = Locacao.criarAPartirDaReserva(reserva);

        Funcionario funcionario = new Funcionario("Jose", "321393232");
        locacao.fechar(BigDecimal.valueOf(1_000), funcionario);

        System.out.println("Status da locação: " + locacao.getStatus());
        System.out.println("Veículo disponível: " + veiculo.isDisponivel());
        System.out.println("Quilometragem veículo: " + veiculo.getQuilometragem());


        Assert.assertEquals(StatusLocacao.FECHADA, locacao.getStatus());
        Assert.assertNotNull(locacao.getEntrega());
        Assert.assertTrue(veiculo.isDisponivel());
        Assert.assertEquals(BigDecimal.valueOf(1_000), veiculo.getQuilometragem());
    }


}
