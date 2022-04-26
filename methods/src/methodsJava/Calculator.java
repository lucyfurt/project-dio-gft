package methodsJava;

public class Calculator {
    public static void soma(double num1, double num2){
        double resultant = num1 + num2;
        System.out.println("A soma de" + num1 + "mais" + num2 + "é" + resultant);

    }
    public static  void subtracao(double num1, double num2){
        double resultant = num1 - num2;
        System.out.println("A subtração" + num1 + "menos" + num2 + "é" + resultant);
    }
    public static void multiplicacao(double num1, double num2){
        double resultant = num1 * num2;
        System.out.println("A multiplicação" + num1 + "vezes" + num2 + "é" + resultant);
    }
    public static void divisao(double num1, double num2){
        double resultant = num1 / num2;
        System.out.println("A divisao" + num1 + "dividido" + num2 + "é" + resultant);
    }

}
