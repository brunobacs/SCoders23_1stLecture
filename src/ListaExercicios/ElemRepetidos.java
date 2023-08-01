package ListaExercicios;

public class ElemRepetidos {
    public static void main(String[] args) {
        double[] input = {2.5, 3.2, 4.5, 5, 6};
        System.out.println(elementosRepetidos(input));
    }

    public static boolean elementosRepetidos(double[] input) {
        for (int i =0; i < input.length; i++){
            /**if (i+1 >= input.length){
                break;
            }*/
            for (int j = 1; j<input.length; j++){
                if(i ==j){
                    continue;
                }
                if(input[i]/input[j] ==1){
                    return true;
                }
            }
        }

        return false;
    }
}
