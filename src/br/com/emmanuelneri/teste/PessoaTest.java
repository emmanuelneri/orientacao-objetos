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

}
