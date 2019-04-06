package br.com.emmanuelneri.exercicio.locadora;

import java.math.BigDecimal;
import java.time.LocalDate;

public class SistemaLocadora {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Joao", "2194894843", "joao@gmail.com", "44929292992");
        Veiculo veiculo = new Veiculo("AAA-1233", "Onix", "LTZ", "Completo", BigDecimal.valueOf(100));
        Reserva reserva = new Reserva(veiculo, cliente, LocalDate.of(2019, 4, 3), LocalDate.of(2019, 4, 8));

        BigDecimal valorPrevistoReserva = reserva.reservar();

        System.out.println("-----------Reserva-------------");


        System.out.println("Valor previsto: " + valorPrevistoReserva);
        System.out.println("Veículo disponível: " + veiculo.isDisponivel());

        System.out.println("-----------Locação-------------");

        Funcionario funcionario = new Funcionario("Jose", "321393232");
        Locacao locacao = Locacao.criarAPartirDaReserva(reserva);
        locacao.fechar(BigDecimal.valueOf(1_000), funcionario);

        System.out.println("Status da locação: " + locacao.getStatus());
        System.out.println("Veículo disponível: " + veiculo.isDisponivel());
        System.out.println("Quilometragem veículo: " + veiculo.getQuilometragem());


    }

}
