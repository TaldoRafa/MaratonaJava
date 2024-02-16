package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());

        LocalDate date = LocalDate.of(2022, Month.JANUARY, 27);
        LocalDate agora = LocalDate.now();
        agora = agora.plusWeeks(4);

        System.out.println(date.getYear());  // retorna o ano
        System.out.println(date.getMonth());  // retorna o mes
        System.out.println(date.getMonthValue()); // retorna o mes em int
        System.out.println(date.getDayOfWeek()); // retorna o dia da semana
        System.out.println(date.getDayOfMonth()); // retorna
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear());
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));
        System.out.println(date);
        System.out.println(agora);
    }
}
