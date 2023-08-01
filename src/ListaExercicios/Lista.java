package ListaExercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista {

    public static void main(String[] args) {
        double[] input = {121000, 14350, 21450};
        double[] resposta = new double[2];
        resposta = custosCarro(input);
        System.out.println(resposta[0]);
        System.out.println(resposta[1]);

    }
    public static double[] custosCarro(double[] input) {
        double[] custoFinal = new double[2];
        custoFinal[0] = (input[1] / input[0]) * 100;
        custoFinal[1] = (input[2] / input[0]) * 100;

        custoFinal[0] = ((int) (custoFinal[0] * 100)) / 100.0;
        custoFinal[1] = ((int) (custoFinal[1] * 100)) / 100.0;

        return custoFinal;
    }

}

