package br.com.emmanuelneri.interfaces.mensagem;

public class TesteMensagem {

    public static void main(String[] args) {
        MensagemEditavel mensagemEditavel = new MensagemEditavel("Mensagem");
        mensagemEditavel.imprimir();

        mensagemEditavel.setConteudo("Nova mensagem");
        mensagemEditavel.imprimir();

        MensagemNaoEditavel mensagem = new MensagemNaoEditavel("Mensagem fixa");
        mensagem.imprimir();
    }

}
