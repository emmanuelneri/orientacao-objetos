package br.com.emmanuelneri.exercicio.locadora.teste;

import br.com.emmanuelneri.exercicio.locadora.*;
import br.com.emmanuelneri.exercicio.locadora.exception.VeiculoIndisponivelException;
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
        locacao.fechar(BigDecimal.valueOf(1_000), funcionario, LocalDate.of(2019, 4, 8));

        System.out.println("Status da locação: " + locacao.getStatus());
        System.out.println("Veículo disponível: " + veiculo.isDisponivel());
        System.out.println("Quilometragem veículo: " + veiculo.getQuilometragem());


        Assert.assertEquals(StatusLocacao.FECHADA, locacao.getStatus());
        Assert.assertNotNull(locacao.getEntrega());
        Assert.assertEquals(locacao.getDataDevolucao(), locacao.getEntrega().getDataEntrega());
        Assert.assertTrue(veiculo.isDisponivel());
        Assert.assertEquals(BigDecimal.valueOf(1_000), veiculo.getQuilometragem());
    }

    @Test
    public void criarUmaLocacaoSemReserva() {
        Cliente cliente = new Cliente("Joao", "2194894843", "joao@gmail.com", "44929292992");
        Veiculo veiculo = new Veiculo("AAA-1233", "Onix", "LTZ", "Completo", BigDecimal.valueOf(100));
        Locacao locacao = new Locacao(veiculo, cliente, LocalDate.of(2019, 3, 1), LocalDate.of(2019, 3, 10), BigDecimal.valueOf(10_000));

        Assert.assertEquals(StatusLocacao.ABERTA, locacao.getStatus());
        Assert.assertNull(locacao.getEntrega());
        Assert.assertFalse(veiculo.isDisponivel());
    }

    @Test
    public void realizarUmEntregaAposDataDeDevolucao() {
        Cliente cliente = new Cliente("Joao", "2194894843", "joao@gmail.com", "44929292992");
        Veiculo veiculo = new Veiculo("AAA-1233", "Onix", "LTZ", "Completo", BigDecimal.valueOf(100));
        Locacao locacao = new Locacao(veiculo, cliente, LocalDate.of(2019, 3, 1), LocalDate.of(2019, 3, 10), BigDecimal.valueOf(10_000));

        Funcionario funcionario = new Funcionario("Jose", "321393232");
        locacao.fechar(BigDecimal.valueOf(13_000), funcionario, LocalDate.of(2019, 3, 15));

        Assert.assertEquals(StatusLocacao.FECHADA, locacao.getStatus());
        Assert.assertNotNull(locacao.getEntrega());
        Assert.assertNotSame(locacao.getDataDevolucao(), locacao.getEntrega().getDataEntrega());
        Assert.assertEquals(LocalDate.of(2019, 3, 15), locacao.getEntrega().getDataEntrega());
        Assert.assertTrue(veiculo.isDisponivel());
        Assert.assertEquals(BigDecimal.valueOf(13_000), veiculo.getQuilometragem());
    }

    @Test(expected = StatusInvalidoException.class)
    public void aoCancelarUmaLocalFechadaDeveRetornarErro() {
        Cliente cliente = new Cliente("Joao", "2194894843", "joao@gmail.com", "44929292992");
        Veiculo veiculo = new Veiculo("AAA-1233", "Onix", "LTZ", "Completo", BigDecimal.valueOf(100));
        Locacao locacao = new Locacao(veiculo, cliente, LocalDate.of(2019, 3, 1), LocalDate.of(2019, 3, 10), BigDecimal.valueOf(10_000));

        Funcionario funcionario = new Funcionario("Jose", "321393232");
        locacao.fechar(BigDecimal.valueOf(13_000), funcionario, LocalDate.of(2019, 3, 15));

        locacao.cancelar();
    }

    @Test(expected = StatusInvalidoException.class)
    public void aoFecharUmaLocalFechadaDeveRetornarErro() {
        Cliente cliente = new Cliente("Joao", "2194894843", "joao@gmail.com", "44929292992");
        Veiculo veiculo = new Veiculo("AAA-1233", "Onix", "LTZ", "Completo", BigDecimal.valueOf(100));
        Locacao locacao = new Locacao(veiculo, cliente, LocalDate.of(2019, 3, 1), LocalDate.of(2019, 3, 10), BigDecimal.valueOf(10_000));

        Funcionario funcionario = new Funcionario("Jose", "321393232");
        locacao.fechar(BigDecimal.valueOf(13_000), funcionario, LocalDate.of(2019, 3, 15));

        locacao.fechar(BigDecimal.valueOf(13_000), funcionario, LocalDate.of(2019, 3, 15));
    }

    @Test(expected = VeiculoIndisponivelException.class)
    public void aoCriarUmaLocacaoComVeiculoIndisponivelDeveRetornarErro() {
        Cliente cliente = new Cliente("Joao", "2194894843", "joao@gmail.com", "44929292992");
        Veiculo veiculo = new Veiculo("AAA-1233", "Onix", "LTZ", "Completo", BigDecimal.valueOf(100));

        veiculo.indisponibilizar();

        Locacao locacao = new Locacao(veiculo, cliente, LocalDate.of(2019, 3, 1), LocalDate.of(2019, 3, 10), BigDecimal.valueOf(10_000));
    }

    @Test(expected = VeiculoIndisponivelException.class)
    public void aoCriarUmaReservaComVeiculoIndisponivelDeveRetornarErro() {
        Cliente cliente = new Cliente("Joao", "2194894843", "joao@gmail.com", "44929292992");
        Veiculo veiculo = new Veiculo("AAA-1233", "Onix", "LTZ", "Completo", BigDecimal.valueOf(100));

        veiculo.indisponibilizar();

        Reserva reserva = new Reserva(veiculo, cliente, LocalDate.of(2019, 4, 3), LocalDate.of(2019, 4, 8));
    }

}
