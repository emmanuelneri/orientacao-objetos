package br.com.emmanuelneri.polimorfismo.exercicio1;

//Criar as classes ContaCorrente e ContaPoupanca de forma que seja possível realizar saque e depósito independente do tipo da conta;
public class TesteContaExe1 {

    public static void main(String[] args) {

        ContaPoupanca contaPoupanca =
                new ContaPoupanca("001");

        contaPoupanca.deposito(1_000);

        ContaCorrente contaCorrente =
                new ContaCorrente("002");

        contaPoupanca.deposito(100);

        saque(contaPoupanca, 10);
        saque(contaCorrente, 50);

        System.out.println(contaPoupanca.getSaldo());
        System.out.println(contaCorrente.getSaldo());

    }

    public static void saque(Conta conta,  double valor) {
        conta.saque(valor);
    }

    public static void deposito(Conta conta, double valor) {
        conta.deposito(valor);
    }

}
