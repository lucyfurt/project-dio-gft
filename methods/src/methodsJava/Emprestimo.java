package methodsJava;

public class Emprestimo {

    public static void caclValor(Double valorSolicitado, Double taxa, Double parcela){

        Double result = taxa * parcela;

        Double resultant = valorSolicitado * result;

        System.out.println(resultant);


    }
}
