package br.com.emmanuelneri.exercicio.locadora;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Entrega {

    private BigDecimal quilometragemFinal;
    private LocalDate dataEntrega = LocalDate.now();
    private Funcionario funcionario;

    public Entrega(BigDecimal quilometragemFinal, Funcionario funcionario) {
        this.quilometragemFinal = quilometragemFinal;
        this.funcionario = funcionario;
    }

    public BigDecimal getQuilometragemFinal() {
        return quilometragemFinal;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }
}
