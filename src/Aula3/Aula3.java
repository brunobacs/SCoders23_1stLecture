import javax.swing.plaf.synth.SynthTextAreaUI;
import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

public class Aula3 {

    //o enum pode ter metodos
    public enum DiaDaSemana{
        SEGUNDA,
        TERÇA,
        QUARTA,
        QUINTA,
        SEXTA,
        SABADO,
        DOMINGO
    }


    // diferenca de classe pra objeto
    // classe = forma => pessoa é classe
    // objeto = instância da classe => bruno
    public static void main(String[] args) {
        DayOfWeek dia =  DayOfWeek.WEDNESDAY;
        System.out.println("hoje eh "+ DayOfWeek.WEDNESDAY.getDisplayName(TextStyle.FULL_STANDALONE,
                new Locale("pt", "BR" )));

        System.out.println("hoje eh "+ DayOfWeek.WEDNESDAY.getDisplayName(TextStyle.SHORT,
                new Locale("pt", "BR" )));

        System.out.println("==================================");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        System.out.println("=============================   =====");

    //recomendar prints => faz operacoes fora, tudo antes

        int a = 0;
        System.out.println(++a);
        int b = 5;
        System.out.println(b++);

        System.out.println(++a == 1 ? "1 == "+ a : "1 != "+ a);
    }

    // instanceOf

    public static void imprimirTipo(Object objeto) {
        if (objeto instanceof String){
            System.out.println("eh string!");
        }else if (objeto instanceof Double){
            System.out.println("é um wrapper");
        }else if (objeto instanceof DayOfWeek){
            System.out.println("eh um enum");
        }else {
            System.out.println("sei la");
        }
    }

    public static boolean eDiaLetivo(DiaDaSemana dia){
          if (DiaDaSemana.SEGUNDA.equals(dia)){
              return true;
          }
          return false;
    }
}
