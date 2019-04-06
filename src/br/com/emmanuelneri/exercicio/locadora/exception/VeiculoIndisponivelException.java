package br.com.emmanuelneri.exercicio.locadora.exception;

public class VeiculoIndisponivelException extends RuntimeException {

    public VeiculoIndisponivelException() {
        super("Veículo indisponível!");
    }
}
