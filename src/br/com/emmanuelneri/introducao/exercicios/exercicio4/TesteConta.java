package br.com.emmanuelneri.introducao.exercicios.exercicio4;

public class TesteConta {

    public static void main(String args[]) {

        Conta conta = new Conta();
        conta.deposito(100);
        System.out.println(conta.consultaSaldo());

        Conta conta2 = new Conta();
        System.out.println(conta2.consultaSaldo());



    }

}
