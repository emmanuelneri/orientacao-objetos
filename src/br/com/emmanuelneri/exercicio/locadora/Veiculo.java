package br.com.emmanuelneri.exercicio.locadora;

import java.math.BigDecimal;

public class Veiculo {

    private String placa;
    private String nome;
    private String modelo;
    private String descricao;
    private BigDecimal valorDiaria;
    private BigDecimal quilometragem = BigDecimal.ZERO;
    private boolean disponivel = true;

    public Veiculo(String placa, String nome, String modelo, String descricao, BigDecimal valorDiaria) {
        this.placa = placa;
        this.nome = nome;
        this.modelo = modelo;
        this.descricao = descricao;
        this.valorDiaria = valorDiaria;
    }

    public void disponibilizar(BigDecimal quilometragem) {
        this.quilometragem = quilometragem;
        disponibilizar();
    }

    public void disponibilizar() {
        this.disponivel = true;
    }

    public void indisponibilizar() {
        this.disponivel = false;
    }

    public String getPlaca() {
        return placa;
    }

    public String getNome() {
        return nome;
    }

    public String getModelo() {
        return modelo;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getValorDiaria() {
        return valorDiaria;
    }

    public BigDecimal getQuilometragem() {
        return quilometragem;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

}
