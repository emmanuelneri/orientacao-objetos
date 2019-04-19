package br.com.emmanuelneri.revisao.agendamento;

import java.time.LocalDateTime;

public abstract class AgendamentoConsulta {

    private Paciente paciente;
    private Medico medico;
    private LocalDateTime dataHora;
    private String sintoma;

    public AgendamentoConsulta(Paciente paciente, Medico medico, LocalDateTime dataHora, String sintoma) {
        this.paciente = paciente;
        this.medico = medico;
        this.dataHora = dataHora;
        this.sintoma = sintoma;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public String getSintoma() {
        return sintoma;
    }
}
