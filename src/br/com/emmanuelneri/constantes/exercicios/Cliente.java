package br.com.emmanuelneri.constantes.exercicios;

public class Cliente {

    private String nome;
    private TipoCliente tipo;

    public Cliente (String nome, TipoCliente tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public TipoCliente getTipo() {
        return tipo;
    }
}
