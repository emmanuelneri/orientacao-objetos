package br.com.emmanuelneri.excecoes;

public class ValorInvalidoException extends RuntimeException {

    public ValorInvalidoException() {
        super("Valor inválido");
    }
}
