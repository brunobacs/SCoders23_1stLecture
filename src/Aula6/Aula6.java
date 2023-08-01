package Aula6;

import java.time.DayOfWeek;

// 24 de julho de 2023
public class Aula6 {
    public static void main(String[] args) {
        DayOfWeek dia = DayOfWeek.MONDAY;
        switch (dia){
            case MONDAY:
                System.out.println("Aula");
                // sem esse break, imprimia esse e segue até encontrar o proximo break
                break;
            case TUESDAY:
                System.out.println("Aula");
                break;
            case WEDNESDAY:
                System.out.println("Aula");
                break;
            case THURSDAY:
                System.out.println("Aula");
                break;
            case FRIDAY:
                System.out.println("Aula");
                break;
            default:
                System.out.println("Folga");
                break;
        }

        // Atualizacao do java

        // -> == lambda expression
        // https://www.delftstack.com/pt/howto/java/java-arrow-operator/
        DayOfWeek banana = DayOfWeek.SATURDAY;
        int energetico = switch (banana){
            case FRIDAY, WEDNESDAY -> 6;
            case MONDAY -> 2;
            case SUNDAY -> 1;
            case THURSDAY -> 3;
            case TUESDAY -> 12;
            case SATURDAY -> 10;
        };

    }
}
