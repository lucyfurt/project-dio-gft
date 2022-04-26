package methodsJava;

public class methodSobrecarga {
    public static void area(Double lado1, Double lado2){
        double result = lado1 * lado2;

        System.out.println("a AREA DO quadrado:" + result);


    }
    public static void area(Double lado1, Double lado2, Double lado3){
        double result = lado1 * lado2 * lado3;

        System.out.println("a AREA DO TESTE:" + result);


    }
    public static void area(Double lado1, Double lado2, Double lado3, Double lado4){
        double result = lado1 * lado2 * lado3 * lado4;

        System.out.println("a AREA DO teste2:" + result);


    }
}
