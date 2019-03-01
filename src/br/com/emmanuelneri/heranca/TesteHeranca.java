package br.com.emmanuelneri.heranca;

public class TesteHeranca {

    public static void main(String args[]) {

        Cliente cliente = new Cliente();
//        cliente.ouvir();

        Pessoa pessoa = new Cliente();

        imprimirNome(new Cliente());
        imprimirNome(new Vendedor("Vendedor"));
//        imprimirNome(new Transportadora());
    }

    public static void imprimirNome(Pessoa pessoa) {
        System.out.println(pessoa.getNome());
    }

}
