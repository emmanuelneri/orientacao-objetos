package br.com.emmanuelneri.revisao.agendamento;

import java.time.LocalDateTime;

public class Consulta extends AgendamentoConsulta {

    private String diagnostico;

    public Consulta(Paciente paciente, Medico medico, LocalDateTime dataHora, String sintoma) {
        super(paciente, medico, dataHora, sintoma);
    }

    public void atender(String diagnostico) {
        if(diagnostico == null) {
            throw new ConsultaSemDiagnosticoExpcetion();
        }

        this.diagnostico = diagnostico;
    }
}
