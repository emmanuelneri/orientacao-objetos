package br.com.emmanuelneri.trabalho.financeiro;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Conta {

    private BigDecimal valorTotal;
    private LocalDate dataVencimento;
    protected LocalDate dataPagamento;
    protected FormaPagamento formaPagamento;
    private StatusConta status = StatusConta.ABERTA;


    public Conta(BigDecimal valorTotal, LocalDate dataVencimento) {
        this.valorTotal = valorTotal;
        this.dataVencimento = dataVencimento;
    }

    protected void fecharConta () {
        this.status = StatusConta.FECHADA;
    }

    protected void contaParcial (){
        this.status = StatusConta.PARCIAL;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public StatusConta getStatus() {
        return status;
    }


}
