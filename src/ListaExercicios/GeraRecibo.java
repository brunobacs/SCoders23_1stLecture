package ListaExercicios;

public class GeraRecibo {
    public static void main(String[] args) {

    }

    public static String avaliacao(double[] input) {

        if (input.length>0){
            double menor = input[0];
            double total = 0.0;
            for (Double preco: input){
                total += preco;
                if (preco < menor){
                    menor = preco;
                }
            }

            Double off = menor/2;
            Double aPagar = total - off;
            String saida;
            String desconto = String.valueOf(off);
            String valorTotal = String.valueOf(total);
            String valorFinal = String.valueOf(aPagar);
            saida = "Valor total: " + valorTotal + " | Valor de descontos: " + desconto + " | Valor a pagar: " + valorFinal;
            return saida;
        }
        return "Valor total: 0";
    }

}

/**
 * Arrays, Ordenação, Operações aritméticas
 * Uma loja de roupas decidiu aquecer suas vendas lançando uma promoção com descontos
 * especiais para clientes que comprassem mais de uma peça. As condições da promoção dizem que, na
 * compra de duas peças, será dado 50% de desconto na peça de menor de valor.
 *
 * Escreva uma função que receba um array contendo o preço das peças de um cliente e calcule o valor
 * total sem descontos, o valor total de descontos, e o valor total a pagar. A saída da função deve
 * ser uma string.
 *
 * */