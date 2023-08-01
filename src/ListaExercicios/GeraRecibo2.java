package ListaExercicios;

public class GeraRecibo2 {


    public static String avaliacao(double[] input) {
        int n = input.length/2;
        double [] menores = new double[n];

        for (int i = 0; i<menores.length; i++){
            menores[i] = Double.POSITIVE_INFINITY;
        }
        double somaPreDesconto =0;
        double descontos = 0;
        double valorComDesconto = 0;


        if (input.length == 0){
            return "";
        }

        for (int i=0; i < input.length; i++){
            somaPreDesconto += input[i];
            for (int j =0; j < n; j++) {
                if (input[i] < menores[j]) {
                    menores[j] = input[i];
                }
            }
        }

        for (int j = 0; j<n; j++){
            descontos = descontos + menores[j]/2;
        }

        valorComDesconto = somaPreDesconto - descontos;
        String saida;
        String desconto = String.valueOf(descontos);
        String valorTotal = String.valueOf(somaPreDesconto);
        String valorFinal = String.valueOf(valorComDesconto);
        saida = "Valor total: " + valorTotal + " | Valor de descontos: " + desconto + " | Valor a pagar: " + valorFinal;
        return saida;
    }

}
