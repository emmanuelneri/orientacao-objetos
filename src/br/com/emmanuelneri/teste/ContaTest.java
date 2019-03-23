package br.com.emmanuelneri.teste;

import org.junit.Assert;
import org.junit.Test;

public class ContaTest {

    @Test
    public void depositoTest() {
        Conta conta = new Conta();
        conta.deposito(15d);
        Assert.assertEquals(Double.valueOf(15), conta.getSaldo());
    }

    @Test
    public void depositoDuasVezesTest() {
        Conta conta = new Conta();
        conta.deposito(15d);
        conta.deposito(15d);
        Assert.assertEquals(Double.valueOf(30), conta.getSaldo());
    }

    @Test(expected = SaldoInsuficienteException.class)
    public void saqueSemSaldoTest() {
        Conta conta = new Conta();
        conta.saque(30d);
    }

    @Test
    public void saqueTest() {
        Conta conta = new Conta();
        conta.deposito(20d);
        conta.saque(19.5);
        Assert.assertEquals(Double.valueOf(0.5), conta.getSaldo());
    }



}
