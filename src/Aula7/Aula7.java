package Aula7;

import java.util.Scanner;

public class Aula7 {
/**
 * Calcule a média aritmética de n valores a serem digitados. = nao sei o numero de digitados
 * <p>
 * Seu programa deve pedir para que o usuário digite uma nota de 0 a 10.
 * <p>
 * Se o valor digitado for menor que 0, seu programa deve efetuar o cálculo da média e imprimir na tela,
 * com a quantidade de notas digitadas
 * <p>
 * Se for maior que 10, deve devolver uma mensagem avisando que a nota está inválida e não adicionar na soma.
 */

public static void main(String[] args) {
    double valor;
    Scanner scan = new Scanner(System.in);
    double somaNotas = 0;
    int numeros = 0;
    valor = scan.nextDouble();

    while(valor >= 0){
        if (valor <= 10){
            somaNotas +=valor;
            numeros++;
        }else{
            System.out.println("valor > 10, deve ser menor");
        }
    }

    if (numeros ==0){
        //....
    }


}


}
