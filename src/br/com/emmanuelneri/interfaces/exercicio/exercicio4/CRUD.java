package br.com.emmanuelneri.interfaces.exercicio.exercicio4;

import java.util.List;

public interface CRUD {

    void criar(Entidade entidade);
    void atualizar(Entidade entidade);
    List<Entidade> buscar();
    void deletar(Entidade entidade);

}
