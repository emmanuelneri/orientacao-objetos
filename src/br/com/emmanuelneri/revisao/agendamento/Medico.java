package br.com.emmanuelneri.revisao.agendamento;

public class Medico extends Pessoa {

    private String crm;
    private Especialidade especialidade;

    public Medico(String nome, String telefone, String crm, Especialidade especialidade) {
        super(nome, telefone);
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }
}
