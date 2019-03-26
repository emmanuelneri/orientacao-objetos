package br.com.emmanuelneri.trabalho.transportadora;

public enum Cidade {
    CIANORTE(Estado.PR),
    SAO_PAULO(Estado.SP),
    BRUSQUE(Estado.SC);

    private final Estado estado;

    Cidade(Estado estado){
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }
}
