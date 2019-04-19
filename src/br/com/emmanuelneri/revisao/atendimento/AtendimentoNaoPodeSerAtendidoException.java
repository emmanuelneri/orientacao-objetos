package br.com.emmanuelneri.revisao.atendimento;

public class AtendimentoNaoPodeSerAtendidoException extends RuntimeException {

    public AtendimentoNaoPodeSerAtendidoException() {
        super("Atendimento não pode ser atendimento se não estiver aberto");
    }
}
