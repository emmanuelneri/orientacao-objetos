package br.com.emmanuelneri.interfaces.exercicio.exercicio4;

import java.util.ArrayList;
import java.util.List;

public class EmpresaCrud implements CRUD {

    private List<Empresa> empresas = new ArrayList<>();

    @Override
    public void criar(final Entidade entidade) {
        this.empresas.add((Empresa) entidade);
    }

    @Override
    public void atualizar(final Entidade entidade) {
        final int empresaIndex = buscarIndexDaListaPorChave(entidade.getChave());
        this.empresas.remove(empresaIndex);
        this.empresas.add(empresaIndex, (Empresa) entidade);
    }

    @Override
    public List<Entidade> buscar() {
        return new ArrayList<>(empresas);
    }

    @Override
    public void deletar(final Entidade entidade) {
        this.empresas.remove((Empresa) entidade);
    }

    private int buscarIndexDaListaPorChave(final String chave) {
        Integer empresaIndex = null;

        for(int i = 0; i< empresas.size(); i++) {
            final Empresa empresa = empresas.get(i);
            if(empresa.getChave().equals(chave)) {
                empresaIndex = i;
                break;
            }
        }

        if(empresaIndex == null) {
            throw new RuntimeException("Empresa não existe");
        }

        return empresaIndex;
    }
}
