import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


//https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

public class Aula4 {
    public static void main(String[] args) {
/*        String frase = """
                
                
                """;

        System.out.printf("hoje é dia %td", LocalDateTime.now());
        System.out.printf("%1$td/%tm", LocalDateTime.now());
        System.out.printf(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/YY")));*/

        int day = LocalDateTime.now().getDayOfMonth();
        LocalDateTime.now().getMonth();

        System.out.println(String.format(LocalDateTime.now().getDayOfMonth() + "-" + LocalDateTime.now().getMonth() + "-" + LocalDateTime.now().getYear(), "YY"));

    }
}
