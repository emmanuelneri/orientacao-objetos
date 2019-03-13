package br.com.emmanuelneri.interfaces.exercicio.exercicio4;

import java.util.ArrayList;
import java.util.List;

public class ClienteCrud implements CRUD {

    private List<Cliente> clientes = new ArrayList<>();

    @Override
    public void criar(final Entidade entidade) {
        this.clientes.add((Cliente) entidade);
    }

    @Override
    public void atualizar(final Entidade entidade) {
        final int clienteIndex = buscarIndexDaListaPorChave(entidade.getChave());
        this.clientes.remove(clienteIndex);
        this.clientes.add(clienteIndex, (Cliente) entidade);
    }

    @Override
    public List<Entidade> buscar() {
        return new ArrayList<>(clientes);
    }

    @Override
    public void deletar(final Entidade entidade) {
        this.clientes.remove((Cliente) entidade);
    }

    private int buscarIndexDaListaPorChave(final String chave) {
        Integer clienteIndex = null;

        for(int i = 0; i< clientes.size(); i++) {
            final Cliente cliente = clientes.get(i);
            if(cliente.getChave().equals(chave)) {
                clienteIndex = i;
                break;
            }
        }

        if(clienteIndex == null) {
            throw new RuntimeException("Cliente não existe");
        }

        return clienteIndex;
    }
}
