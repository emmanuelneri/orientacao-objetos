package br.com.emmanuelneri.interfaces.exercicio.exercicio4;

import java.util.List;

public class TesteCrud {

    public static void main(String[] args) {
        final ClienteCrud clienteCrud = new ClienteCrud();

        final Cliente cliente1 = new Cliente("123", "Cliente 1");
        final Cliente cliente2 = new Cliente("321", "Cliente 2");
        final Cliente cliente3 = new Cliente("456", "Cliente 3");

        clienteCrud.criar(cliente1);
        clienteCrud.criar(cliente2);
        clienteCrud.criar(cliente3);

        cliente2.setNome("Nome Alterado");
        clienteCrud.atualizar(cliente2);

        clienteCrud.deletar(cliente3);

        final List<Entidade> clientes = clienteCrud.buscar();

        for(int i = 0; i < clientes.size(); i++) {
            System.out.println("Cliente - "
                    + "CPF: " + ((Cliente) clientes.get(i)).getCpf()
                    + " "
                    + "Nome: " + ((Cliente) clientes.get(i)).getNome());
        }

        System.out.println("--------------------------------------------------------------------");

        final EmpresaCrud empresaCrud = new EmpresaCrud();

        final Empresa empresa1 = new Empresa("02140000181", "Empresa 1");
        final Empresa empresa2 = new Empresa("02140000182", "Empresa 2");
        final Empresa empresa3 = new Empresa("02140000183", "Empresa 3");
        final Empresa empresa4 = new Empresa("02140000184", "Empresa 4");

        empresaCrud.criar(empresa1);
        empresaCrud.criar(empresa2);
        empresaCrud.criar(empresa3);
        empresaCrud.criar(empresa4);

        empresa4.setNome("Empresa Alterada 4");
        empresaCrud.atualizar(empresa4);

        empresaCrud.deletar(empresa1);

        final List<Entidade> empresas = empresaCrud.buscar();
        for(int i = 0; i < empresas.size(); i++) {
            System.out.println("Empresa - "
                    + "CPF: " + ((Empresa) empresas.get(i)).getCnpj()
                    + " "
                    + "Nome: " + ((Empresa) empresas.get(i)).getNome());
        }

    }

}
