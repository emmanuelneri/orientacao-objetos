package br.com.emmanuelneri.revisao.atendimento;

public enum Cidade {
    CIANORTE(Estado.PARANA),
    SAO_PAULO(Estado.SAO_PAULO);

    private final Estado estado;

    Cidade(Estado estado) {
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }

    enum Estado {
        PARANA,
        SAO_PAULO;
    }
}
