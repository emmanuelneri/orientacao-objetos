package br.com.emmanuelneri.revisao.atendimento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Atendimento {

    private Cliente cliente;
    private Atendente atendente;
    private String descricaoProblema;
    private LocalDateTime dataHoraAbertura = LocalDateTime.now();
    private LocalDateTime dataHoraAtendimento;
    private FormaAtendimento formaAtendimento;
    private BigDecimal valor;
    private StatusAtendimento status = StatusAtendimento.ABERTO;

    private Atendimento(String descricaoProblema) {
        this.descricaoProblema = descricaoProblema;
    }

    public Atendimento iniciar(String descricaoProblema) {
        if(descricaoProblema == null) {
            throw new DescricaoDoProblemaObrigatorioExeception();
        }
        return new Atendimento(descricaoProblema);
    }

    public void fechar(FormaAtendimento formaAtendimento, BigDecimal valor) {
        if(formaAtendimento == null) {
            throw new FormaAtendimentoObrigatorioExpcetion();
        }

        if(status != StatusAtendimento.ABERTO) {
            throw new AtendimentoNaoPodeSerAtendidoException();
        }

        this.status = StatusAtendimento.FECHADO;
        this.dataHoraAtendimento = LocalDateTime.now();
        this.formaAtendimento = formaAtendimento;
        this.valor = valor;
    }

    public void cancelar() {
        if(status == StatusAtendimento.FECHADO) {
            throw new AtendimentoNaoPodeSerCanceladoExpcetion();
        }

        this.status = StatusAtendimento.CANCELADO;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Atendente getAtendente() {
        return atendente;
    }

    public String getDescricaoProblema() {
        return descricaoProblema;
    }

    public LocalDateTime getDataHoraAbertura() {
        return dataHoraAbertura;
    }

    public LocalDateTime getDataHoraAtendimento() {
        return dataHoraAtendimento;
    }

    public FormaAtendimento getFormaAtendimento() {
        return formaAtendimento;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public StatusAtendimento getStatus() {
        return status;
    }
}
