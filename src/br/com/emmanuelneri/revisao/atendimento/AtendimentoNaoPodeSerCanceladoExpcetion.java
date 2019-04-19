package br.com.emmanuelneri.revisao.atendimento;

public class AtendimentoNaoPodeSerCanceladoExpcetion extends RuntimeException {

    public AtendimentoNaoPodeSerCanceladoExpcetion() {
        super("Atendimento fechado não pode ser cancelado");
    }
}
