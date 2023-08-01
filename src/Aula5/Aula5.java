package Aula5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Criar um programa que recebe 2 números e realiza a soma deles. Porém, nesse caso o programa deve observar quantos
 * parâmetros são enviados via terminal(args).
 * <p>
 * Se for nenhum, deve pedir via System.in que o usuário digite 2 números. No caso de vir apenas 1, deve pedir outro
 * parâmetro via System.in. Se for 2, deve realizar a soma dos dois.
 * <p>
 * No caso de qualquer outra quantidade. Deve apresentar uma mensagem de erro falando que a quantidade é inválida.
 */
public class Aula5 {
    public static void main(String[] args) {
        double soma =0;
        String numero1;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(System.in);

        while (true){
            if (args.length > 0 && args.length < 3){
                double parcela1 = Double.parseDouble(args[0]);
                double parcela2 = Double.parseDouble(args[1]);
                System.out.println(parcela1 + parcela2);
                break;
            } else if (args.length > 2){
                System.out.println("erro, temos numeros demais");
                break;
            }else {
                numero1 = scan.next();
                String numero[] = numero1.split(" ");
                scan.close();
                double n1 = Double.parseDouble(numero[0]);
                double n2 = Double.parseDouble(numero[1]);
                System.out.println(n1+n2);
            }
        }


        /**
         * prof fez tres if
         * if (args.length == 0)
         * scnaner 2
         * return;
         * if (args.length == 1)
         * args[0] + scanner 1
         * return ;
         * if args.lenght = 2
         * soma args[0]+args[1]
         * else
         * system.err
         * return;
         *
         * */


    }
}
