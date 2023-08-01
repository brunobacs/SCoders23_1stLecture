public class Exercicio2 {
    public static void main(String[] args) {
        /**
         * Criar uma classe com uma função main que vai receber um número via args e dizer se esse número é par ou impar
         */
        int argumentp = Integer.parseInt(args[0]);
        int resto = argumentp % 2;
        String parOuImpar = resto ==0 ? "Par" : "Impar";

        System.out.println(parOuImpar);


    }
}
