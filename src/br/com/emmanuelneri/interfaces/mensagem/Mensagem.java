package br.com.emmanuelneri.interfaces.mensagem;

public abstract class Mensagem {

    protected String conteudo;

    public Mensagem(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }
}
