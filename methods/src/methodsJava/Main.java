package methodsJava;

public class Main {
    public static void main(String[] args){

        System.out.println("EXERCICIO CALCULADORA");
        Calculator.soma(1,9);
        Calculator.subtracao(9, 1);
        Calculator.multiplicacao(9,9);
        Calculator.divisao(10,5);
        System.out.println("EXERCICIO MENSAGEM");
        Mensagem.obterMensagem(4);
        Mensagem.obterMensagem(13);
        Mensagem.obterMensagem(5);
        System.out.println("EXERCICIO EMPRESTIMO");

Emprestimo.caclValor(1000.0,2.0,12.0);

    }
}
