package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(); // long ms
        System.out.println(date);
        System.out.println(date.getTime());
    }
}
