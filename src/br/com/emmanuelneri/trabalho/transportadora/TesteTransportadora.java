package br.com.emmanuelneri.trabalho.transportadora;

import java.math.BigDecimal;

public class TesteTransportadora {
    public static void main(String[] args) {
        Endereco enderecoTransportadora =
                new Endereco("Rua UMDOISTRES, 123","87200-000",Cidade.CIANORTE);
        Transportadora transportadora =
                new Transportadora("TransADS",enderecoTransportadora,"12345678901234");
        Busca busca = new Busca(transportadora);

        Endereco enderecoCliente =
                new Endereco("Avenida Sao Paulo,123","87200-000",Cidade.CIANORTE);
        Cliente cliente =
                new Cliente("Samir",enderecoCliente ,TipoPessoa.FISICA, "05081748994");
        Produto produto =
                new Produto("Mac", BigDecimal.valueOf(2),"12345");
        busca.buscar(cliente, produto);

        Entrega entrega = new Entrega();
        entrega.separaProduto(busca);
        entrega.entregar();
    }
}
