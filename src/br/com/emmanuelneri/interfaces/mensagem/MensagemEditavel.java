package br.com.emmanuelneri.interfaces.mensagem;

public class MensagemEditavel extends Mensagem implements Imprimivel {

    public MensagemEditavel(String conteudo) {
        super(conteudo);
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public void imprimir() {
        System.out.println("Mensagem editavel: " + getConteudo());
    }
}
