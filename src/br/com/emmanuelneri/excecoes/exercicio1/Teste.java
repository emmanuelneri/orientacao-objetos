package br.com.emmanuelneri.excecoes.exercicio1;

public class Teste {

    public static void main(String[] args) {

      try {
          System.out.println(new Bilheteria(0, 1)
                  .divisao());
      } catch (DivisaoPorZeroException dex) {
          System.out.println(dex.getMessage());
      }

        System.out.println("continua");
    }

}
