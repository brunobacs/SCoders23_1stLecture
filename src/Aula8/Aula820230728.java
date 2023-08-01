package Aula8;
// 28 de julho 2023 - sexta-feira

import java.util.Arrays;
import java.util.Scanner;

// Exceção
public class Aula820230728 {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        double[] notas;
        double somatoria;
        int quantidade;
        double valor;
        System.out.println("Digite a quantidade de numeros: ");
        quantidade = entrada.nextInt();
        notas = new double[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite um valor: ");
            valor = entrada.nextDouble();
            if (valor <= 10 && valor > 0) {
                notas[i] = valor;
            } else {
                i--;
                System.err.println("Valor digitado deve ser menor do que 10 e maior que 0.");
            }
        }
        if (quantidade == 0) {
            System.out.println("Nenhum número foi digitado");
        } else {
            somatoria = 0;
            for(double notaIndividual : notas) {
                somatoria += notaIndividual;
            }
            System.out.println("O resultado da média foi de" + (somatoria / quantidade));
            System.out.println("args = " + Arrays.toString(notas));
        }



    }
}
