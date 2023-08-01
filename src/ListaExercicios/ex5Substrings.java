package ListaExercicios;

public class ex5Substrings {

    public static void main(String[] args) {
        String entrada = "golog";
        System.out.println(primeiroCaractereUnico(entrada));
    }
    public static int primeiroCaractereUnico(String input) {
            String[] palavra = input.split("");
            int[] contador = new int[input.length()];
            if (input.length() > 1){
              for (int i = 0; i < input.length(); i++){
                  for(int j = 0; j < input.length(); j++) {
                      if (i == j) {
                          continue;
                      }
                      if ((palavra[i].equalsIgnoreCase(palavra[j]))) {
                          contador[i] += 1;
                          contador[j] += 1;
                      }
                  }
              }
              for (int i =0; i<contador.length; i++){
                  if (contador[i]==0){
                      return i;
                  }
              }
            }
            return -1;
        }
    }
