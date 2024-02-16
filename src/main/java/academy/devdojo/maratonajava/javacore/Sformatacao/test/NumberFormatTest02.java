package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localePt = new Locale("pt", "br");
        Locale localeJp = Locale.JAPAN;
        Locale localeIt = Locale.ITALY;
        NumberFormat[] numberFormat = new NumberFormat[4];

        numberFormat[0] = NumberFormat.getCurrencyInstance();
        numberFormat[1] = NumberFormat.getCurrencyInstance(localePt);
        numberFormat[2] = NumberFormat.getCurrencyInstance(localeJp);
        numberFormat[3] = NumberFormat.getCurrencyInstance(localeIt);

        double valor = 1_000.2130;

        for (NumberFormat format : numberFormat) {
            System.out.println(format.getMaximumFractionDigits());
            System.out.println(format.format(valor));
        }

        String valorString = "R$ 1.000,21";
        
        try {
            System.out.println(numberFormat[0].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
