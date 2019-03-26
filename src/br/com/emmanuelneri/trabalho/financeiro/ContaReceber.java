package br.com.emmanuelneri.trabalho.financeiro;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ContaReceber extends Conta {

    private Cliente cliente;
    private BigDecimal valorRecebido = BigDecimal.ZERO;

    public ContaReceber(BigDecimal valor, LocalDate dataVencimento, Cliente cliente) {
        super(valor, dataVencimento);
        this.cliente = cliente;
    }

    public void receber (BigDecimal valor, FormaPagamento formaPagamento){

        this.formaPagamento = formaPagamento;
        this.dataPagamento = LocalDate.now();
        this.valorRecebido = valorRecebido.add(valor);

        if (getValorTotal().compareTo(valorRecebido) > 0 ){
            contaParcial();
        } else if (getValorTotal().compareTo(valorRecebido) == 0){
            fecharConta();
        } else {
            throw new ValorInvalidoException("Deu ruim!");
        }

    }

    public BigDecimal getValorRecebido() {
        return valorRecebido;
    }
}
