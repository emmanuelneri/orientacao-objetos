package br.com.emmanuelneri.teste;

import br.com.emmanuelneri.interfaces.desconto.DescontoProduto;
import org.junit.Assert;
import org.junit.Test;

public class DescontoProdutoTest {

    @Test
    public void validarValorZero() {
        DescontoProduto desconto = new DescontoProduto();
        Double calcular = desconto.calcular(0);
        Assert.assertEquals(Double.valueOf(0), calcular);
    }

    @Test
    public void validarValor() {
        DescontoProduto desconto = new DescontoProduto();
        Double valor = desconto.calcular(10);
        Assert.assertEquals(Double.valueOf(0.5), valor);
    }



}
