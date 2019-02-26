package br.com.emmanuelneri.constantes;

public class Pessoa {

    private String nome;
    private TipoPessoa tipo = TipoPessoa.FISICA;

    public void teste() {
        if(tipo == TipoPessoa.FISICA){
            System.out.println("dsadas");
        }
    }


    enum TipoPessoa {
        FISICA,
        JURIDICA;

    }
}
