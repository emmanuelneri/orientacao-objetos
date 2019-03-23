package br.com.emmanuelneri.java;

import org.junit.Assert;
import org.junit.Test;

public class TestEmpresa {

    public static void main(String[] args) {
        Empresa empresa = new Empresa("1");
        Empresa empresa2 = new Empresa("2");

        System.out.println(empresa.equals(empresa));
        System.out.println(empresa.equals(empresa2));
    }

    @Test
    public void testaEmpresasIguais() {
        Empresa empresa = new Empresa("1");
        Assert.assertTrue(empresa.equals(empresa));
    }

    @Test
    public void testaEmpresasComCnpjsDiferentes() {
        Empresa empresa = new Empresa("1");
        Empresa empresa2 = new Empresa("2");
        Assert.assertFalse(empresa.equals(empresa2));
    }

}
