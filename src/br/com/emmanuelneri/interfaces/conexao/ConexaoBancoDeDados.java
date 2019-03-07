package br.com.emmanuelneri.interfaces.conexao;

import java.sql.Connection;

public interface ConexaoBancoDeDados {

    Connection criarConexao();
    void fecharConexao();

}
