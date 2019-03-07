package br.com.emmanuelneri.interfaces.conexao;

import java.sql.Connection;

public class ConexaoOracle implements ConexaoBancoDeDados {

    @Override
    public Connection criarConexao() {
        return null;
    }

    @Override
    public void fecharConexao() {

    }
}
