package br.com.emmanuelneri.polimorfismo.tipopessoa;

public enum TipoPessoa {

    FISICA("Física") {
        @Override
        public double calcularDesconto(double valor) {
            return valor - (valor * 0.10);
        }
    },
    JURIDICA("Jurídica") {
        @Override
        public double calcularDesconto(double valor) {
            return valor - (valor * 0.15);
        }
    };
    private String nome;

    TipoPessoa(String nome) {
        this.nome = nome;
    }

    public abstract double calcularDesconto(final double valor);
}

