package ListaExercicios;

// mais de 10 = 1,25
// menos de 10 = 1,45

public class Ex4CustoCompra {
    public static void main(String[] args) {
//       enum frutas {Pera, Laranja, Maca, Tomate, Caqui};

        double resposta1 = custoCompra(2.4);
        double resposta2 = custoCompra(24);
        double resposta3 = custoCompra(9);

        System.out.println(resposta1);
        System.out.println(resposta2);
        System.out.println(resposta3);
    }



    public static double custoCompra(double input) {
        if (input > 10) {
            return (((int) (input * 100)) * 1.25 )/ 100.0;
        }
        return (((int) (input * 100)) * 1.45 )/ 100.0;
    }

}