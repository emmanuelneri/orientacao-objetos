package br.com.emmanuelneri.trabalho.financeiro;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TesteConta {

    @Test
    public void testaRecebimentoTotal(){
        Cliente cliente = new Cliente("Ana");
        ContaReceber contaReceber = new ContaReceber(BigDecimal.valueOf(50), LocalDate.now(), cliente);
        contaReceber.receber(BigDecimal.valueOf(50), FormaPagamento.A_VISTA);
        Assert.assertEquals(contaReceber.getValorRecebido(), contaReceber.getValorTotal());
        Assert.assertEquals(StatusConta.FECHADA, contaReceber.getStatus());
    }

    @Test
    public void testarRecebimentoparcial (){
        Cliente cliente = new Cliente("Ana");
        ContaReceber contaReceber = new ContaReceber(BigDecimal.valueOf(50), LocalDate.now(), cliente);
        contaReceber.receber(BigDecimal.valueOf(30), FormaPagamento.A_VISTA);
        Assert.assertEquals(BigDecimal.valueOf(30), contaReceber.getValorRecebido());
        Assert.assertEquals(StatusConta.PARCIAL, contaReceber.getStatus());

        contaReceber.receber(BigDecimal.valueOf(20), FormaPagamento.A_VISTA);
        Assert.assertEquals(contaReceber.getValorRecebido(), contaReceber.getValorTotal());
        Assert.assertEquals(StatusConta.FECHADA, contaReceber.getStatus());   
    }


}
