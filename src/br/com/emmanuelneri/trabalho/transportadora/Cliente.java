package br.com.emmanuelneri.trabalho.transportadora;

public class Cliente extends Pessoa {
    private TipoPessoa tipoPessoa;
    private String documento;

    public Cliente(String nome, Endereco endereco,
                   TipoPessoa tipoPessoa, String documento) {
        super(nome, endereco);
        this.tipoPessoa = tipoPessoa;
        this.documento = documento;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public String getDocumento() {
        return documento;
    }
}
