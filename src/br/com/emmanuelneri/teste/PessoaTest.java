package br.com.emmanuelneri.teste;

import br.com.emmanuelneri.heranca.exercicios.exercicio5.Pessoa;
import org.junit.Assert;
import org.junit.Test;

public class PessoaTest {

    @Test
    public void testarNomeDaPessoa() {
        Pessoa pessoa = new Pessoa("Nome");
        Assert.assertEquals("Nome", pessoa.getNome());
    }


    @Test
    public void testDouble() {
        Double valor = 10d;
        Assert.assertEquals(Double.valueOf(10), valor);
    }

}
