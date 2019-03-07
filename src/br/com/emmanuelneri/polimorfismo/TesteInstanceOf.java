package br.com.emmanuelneri.polimorfismo;

public class TesteInstanceOf {

    public static void main(String[] args) {

        teste(10);

    }

    private static void teste(Object object) {

        if(object instanceof String) {
            System.out.println(((
                    (String) object).toLowerCase())
            );
        }

        if(object instanceof Integer) {
            System.out.println((
                    (Integer) object).intValue());
        }


    }

}
