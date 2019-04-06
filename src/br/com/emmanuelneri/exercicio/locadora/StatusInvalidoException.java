package br.com.emmanuelneri.exercicio.locadora;

public class StatusInvalidoException extends RuntimeException {

    public StatusInvalidoException(String message) {
        super(message);
    }
}
