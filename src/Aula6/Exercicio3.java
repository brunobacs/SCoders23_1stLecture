package Aula6;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double primeiro;
        double segundo;
        Double resultado;
        String operacao;

        System.out.println("primeiro numero");
        primeiro = scan.nextDouble();
        System.out.println("segundo numero");
        segundo = scan.nextDouble();
        System.out.println("operacao");
        operacao = scan.next();

        resultado = switch (operacao) {
            case "*" -> primeiro * segundo;
            case "+" -> primeiro + segundo;
            case "/" -> primeiro / segundo;
            default -> null;
        };

        if (resultado == null) {
            System.err.println("nulo");
        }

        scan.close();

        /**
         * double a, b;
         *         a = scan.nextDouble();
         *         b = scan.nextDouble();
         *
         *         String operacao = scan.next();
         *         scan.close();
         *         enum operador{SOMA, DIVISAO, MULTIPLICACAO, SUBTRACAO, ERRO};
         *         var saida = operador.ERRO;
         *         if (operacao.equalsIgnoreCase("+")){
         *             saida = operador.SOMA;
         *         }else if(operacao.equalsIgnoreCase("-")){
         *             saida = operador.SUBTRACAO;
         *         }else if(operacao.equalsIgnoreCase("/")){
         *             saida = operador.DIVISAO;
         *         }else if(operacao.equalsIgnoreCase("*")){
         *             saida = operador.MULTIPLICACAO;
         *         }
         *
         *         double resultado = switch(saida){
         *             case operador.SOMA -> a + b;
         *             case operador.DIVISAO -> a/b;
         *             case operador.MULTIPLICACAO -> a*b;
         *             case operador.SUBTRACAO -> a-b;
         *             default -> 0;
         *
         *
         *         };
         * */
    }
}
