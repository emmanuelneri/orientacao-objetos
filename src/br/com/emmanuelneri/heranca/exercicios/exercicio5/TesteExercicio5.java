package br.com.emmanuelneri.heranca.exercicios.exercicio5;

//Criar uma hierarquia de classes para atender uma empresa prestadora de serviço. A empresa oferece os serviços de empréstimo, seguro de veículo e seguro de vida
public class TesteExercicio5 {

    public static void main(String[] args) {

        Cliente joão = new Cliente("João", "02933294793");
        Emprestimo emprestimo = new Emprestimo(joão, "Emprestimo imobiliário", 10_000);
        emprestimo.setCredito(50_000);

        Cliente jose = new Cliente("jose", "034409304903");
        Veiculo veiculo = new Veiculo("Chevrolet", "Azul", "AAA-2030");
        SeguroVeiculo seguroVeiculo = new SeguroVeiculo(jose, "Seguro Chevrolet Azul", 1_000, veiculo);
        seguroVeiculo.setApolice("4093430493");

        Cliente maria = new Cliente("Maria", "94340930493");
        Pessoa filhoMaria = new Pessoa("Joao");
        SeguroVida seguroVida = new SeguroVida(maria, "Seguro da Maria", 200, filhoMaria);
        seguroVida.setApolice("0494039403");

    }

}
