package br.com.emmanuelneri.trabalho.financeiro;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ContaPagar extends Conta {

    private Fornecedor fornecedor;

    public ContaPagar(BigDecimal valor, LocalDate dataVencimento, Fornecedor fornecedor) {
        super(valor, dataVencimento);
        this.fornecedor = fornecedor;
    }

    public void pagar (FormaPagamento formaPagamento){
        this.formaPagamento = formaPagamento;
        this.dataPagamento = LocalDate.now();
        this.fecharConta();
    }
}
