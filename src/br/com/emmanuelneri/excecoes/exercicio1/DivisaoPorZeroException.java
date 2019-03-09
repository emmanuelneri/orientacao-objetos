package br.com.emmanuelneri.excecoes.exercicio1;

public class DivisaoPorZeroException extends RuntimeException {

    public DivisaoPorZeroException() {
        super("Valor tem que ser maior que zero");
    }


}
