package ListaExercicios;

public class Ex3ReajusteSal {

    public static void main(String[] args) {
        double[] input4 = {1, 5.0, 2000.00};
        double[] input = {5.1, 6.7, 4500};
        double[] input2 = {11,4.5,2500.00};
        double[] input3 = {10.1, 4.7, 4100};

        double resposta4 = calculoSalario(input4);
        double resposta = calculoSalario(input);
        double resposta2 = calculoSalario(input2);
        double resposta3 = calculoSalario(input3);

        System.out.println(resposta4);
        System.out.println(resposta);
        System.out.println(resposta2);
        System.out.println(resposta3);

    }
    public static double calculoSalario( double[] input) {
        if (input[0] < 5.0){
            double aumentoTempoServico = (input[2]*0.01);
            double aumentoIPCA = ((input[1]/100)*input[2]);
            return (input[2]+ aumentoTempoServico +aumentoIPCA);
        }

        if (input[0] >= 5.0 && input[0] < 10.0){
            double aumentoTempoServico = (input[2]*0.015);
            double aumentoIPCA =((input[1]/100)*input[2]);
            return (input[2]+ aumentoIPCA+aumentoTempoServico);
        }

        if (input[0] >=10.0){
            double aumentoTempoServico = (input[2]*0.02);
            double aumentoIPCA = (input[1]/100)*input[2];
            return (input[2]+aumentoIPCA + aumentoTempoServico);
        }

        return input[2];
    }


}
