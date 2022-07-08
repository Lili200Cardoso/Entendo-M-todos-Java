package one.digitalinnovatin.basecamp;

// Classe principal dos exercícios da Aula 1 de Métodos.

public class Main {

    public static void main(String[] args) {

        // Calculadora

        System.out.println("Exercícios calculadora");
        Calculadora.soma(3,6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7,8);
        Calculadora.divisao(5, 2.5);

        // Mensagem

        System.out.println("Exercícios Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(13);
        Mensagem.obterMensagem(20);
        Mensagem.obterMensagem(3);

        //Empréstimo
        System.out.println("Exercícios Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresparcelas());
        Emprestimo.calcular(1000, 5);
    }
}
