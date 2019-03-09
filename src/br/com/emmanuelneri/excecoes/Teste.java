package br.com.emmanuelneri.excecoes;

public class Teste {

    public static void main(String[] args) {

//        validaNumero(10);

        int valor = 0;

        if(valor < 0) {
            throw new RuntimeException("Valor precisa ser maior que zero");
        }
    }

    public static void validaNumero(int valor) throws Exception {
        if(valor < 0) {
            throw new Exception("Valor precisa ser maior que zero");
        }
    }

}
