package br.com.emmanuelneri.revisao.atendimento;

public class FormaAtendimentoObrigatorioExpcetion extends RuntimeException {

    public FormaAtendimentoObrigatorioExpcetion() {
        super("Forma de atendimento obrigatório");
    }
}
