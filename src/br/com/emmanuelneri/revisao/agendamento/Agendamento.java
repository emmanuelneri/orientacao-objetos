package br.com.emmanuelneri.revisao.agendamento;

import java.time.LocalDateTime;

public class Agendamento extends AgendamentoConsulta {

    public Agendamento(Paciente paciente, Medico medico, LocalDateTime dataHora, String sintoma) {
        super(paciente, medico, dataHora, sintoma);
    }
}

