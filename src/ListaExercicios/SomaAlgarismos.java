package ListaExercicios;

public class SomaAlgarismos {
    public static void main(String[] args) {

    }

    public static int somaAlgarismos(int input) {

        if (input>0){
            String algarism = String.valueOf(input);
            String[] algarismos = algarism.split("");
            int soma = 0;
            for (String algarismo : algarismos) {
                int elemento = Integer.parseInt(algarismo);
                soma += elemento;
            }

            return soma;
        }
        return -1;
    }
}
