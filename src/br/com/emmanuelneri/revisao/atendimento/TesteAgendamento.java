package br.com.emmanuelneri.revisao.atendimento;

public class TesteAgendamento {

    public static void main(String[] args) {

        Endereco endereco = new Endereco("rua", "1010", "87200-000", "Zona 2", Cidade.CIANORTE);

        Endereco endereco2 = new Endereco();
        endereco2.setLogradouro("rua");
        endereco2.setNumero("0202");
        endereco2.setCep("8722-999");
        endereco2.setBairro("Zona 2");
        endereco.setCidade(Cidade.CIANORTE);


    }

}
