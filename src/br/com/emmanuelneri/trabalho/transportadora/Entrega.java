package br.com.emmanuelneri.trabalho.transportadora;

import java.time.LocalDateTime;

public class Entrega {
    private Produto produto;
    private Cliente destinatario;
    private LocalDateTime dataEntrega;

    public void separaProduto(Busca busca){
        this.produto = busca.getProduto();
        this.destinatario = busca.getCliente();
    }

    public void entregar(){
        this.dataEntrega = LocalDateTime.now();
        System.out.println("Chegou!!!");
    }
}
