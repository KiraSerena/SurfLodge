import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args)
    {

        LocalDateTime nu = LocalDateTime.now();

        System.out.println("Nu: " + nu);

        LocalDateTime imorgen = LocalDateTime.of(2018,01,23,10,0);

        System.out.println("I morgen: " + imorgen);

        LocalDateTime iovermorgen =  imorgen.plusDays(1);

        System.out.println("I overmorgen: " + iovermorgen);

    }
}
