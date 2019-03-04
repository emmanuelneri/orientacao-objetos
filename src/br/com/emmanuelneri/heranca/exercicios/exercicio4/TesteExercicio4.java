package br.com.emmanuelneri.heranca.exercicios.exercicio4;

//Criar uma hierarquia de classes para uma loja que venda de livros, revistas e jogos. Sobrescreva o método toString() para que imprima:
// * Para livros: nome, preço e autor
// * Para revistas: nome, preço, categoria, edição
// * Para jogos: nome, preço, categoria
public class TesteExercicio4 {

    public static void main(String[] args) {
        System.out.println(new Livro("Java", 10, "Deitel"));
        System.out.println(new Revista("Java Magazine", 2.9, "Programação", "10"));
        System.out.println(new Jogo("World of Warcraft", 99, "RPG"));
    }

}
