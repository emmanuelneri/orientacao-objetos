package br.com.emmanuelneri.heranca.exercicios.exercicio1;

//Criar uma estrutura de hierarquia de classes com pelo menos 2 níveis abaixo da classe inicial Animal. (obs: as classes devem conter atributos e métodos)
public class TesteExercicio1 {

    public static void main(String[] args) {
        Animal dogGenerico = new Pug("Pug genérico");
        Cachorro dogIntermediario = new Pug("Pug cachorro");
        Pug dogEspecifico = new Pug("Pug específico");
    }

}

