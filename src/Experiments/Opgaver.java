package Experiments;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Opgaver
{
    public static void main(String[] args)
    {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime tomorrow = LocalDateTime.of(2018, 1, 22,  12, 0);
        System.out.println(tomorrow);

        LocalDateTime theDayAfterTomorrow = tomorrow.plusDays(1);
        System.out.println(theDayAfterTomorrow);

        System.out.println(theDayAfterTomorrow.getYear());
    }
}
