/*
* Criar uma função que transforma o valor de uma temperatura em graus celsius
* em fahrenheit seguindo a fórmula abaixo:

 * fahrenheit = (celsius * fator1) + fator2
 * fator1 = 9/5
 * fator2 = 32
 * */

// nao concatenar string em laço

public class Exercicio1 {
    public static void main(String[] args) {

        double celsius = 18;
        // erro = inteiro / inteiro, precisa colocar o .0 no final pra saber q é double/double
        final double fator1 = 9.0/5.0;
        final double fator2 = 32.0;
        double fahrenheit = (celsius*fator1) + fator2;

        System.out.println(fahrenheit);
        String nome1 = "Bruno";
        String nome2 = "Bruno";

        System.out.println(nome1 == nome2);

        // == compara posicao de memoria, a nao ser pra primitivos
        // vai explicar por que nome1 e nome2 estao na mesma posicao de memoria

    }


}
