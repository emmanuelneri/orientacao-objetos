package br.com.emmanuelneri.polimorfismo.pessoa;

import java.util.ArrayList;
import java.util.List;

public class TesteAcessoPessoa {

    public static void main(String args[]) {

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Vendedor("Vendedor", "1", "Livros"));
        pessoas.add(new Fornecedor("Fornecedor", "1",  "Revistas"));

        for(Pessoa pessoa : pessoas) {
            System.out.println("Nome completo: " + pessoa.toString());

//            if(pessoa instanceof Vendedor) {
//                System.out.println("Departamento: " + ((Vendedor) pessoa).getDepartamento());
//            }
//
//            if(pessoa instanceof Fornecedor) {
//                System.out.println("Especialidade: " + ((Fornecedor) pessoa).getEspecialidade());
//            }

            System.out.println("------------------------");
        }
    }

}
