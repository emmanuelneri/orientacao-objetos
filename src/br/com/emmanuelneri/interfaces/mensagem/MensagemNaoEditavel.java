package br.com.emmanuelneri.interfaces.mensagem;

public class MensagemNaoEditavel extends Mensagem implements Imprimivel {

    public MensagemNaoEditavel(String conteudo) {
        super(conteudo);
    }

    @Override
    public void imprimir() {
        System.out.println("Mensagem não editavel: " + getConteudo());
    }
}
