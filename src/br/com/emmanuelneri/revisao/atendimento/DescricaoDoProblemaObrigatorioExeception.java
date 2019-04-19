package br.com.emmanuelneri.revisao.atendimento;

public class DescricaoDoProblemaObrigatorioExeception extends RuntimeException {

    public DescricaoDoProblemaObrigatorioExeception() {
        super("Descrição do Problema é obrigatório");
    }
}
