package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localePt = new Locale("pt", "br");
        Locale localeJp = Locale.JAPAN;
        Locale localeIt = Locale.ITALY;
        NumberFormat[] numberFormat = new NumberFormat[4];

        numberFormat[0] = NumberFormat.getInstance();
        numberFormat[1] = NumberFormat.getInstance(localePt);
        numberFormat[2] = NumberFormat.getInstance(localeJp);
        numberFormat[3] = NumberFormat.getInstance(localeIt);

        double valor = 10_000.2130;

        for (NumberFormat format : numberFormat) {
            System.out.println(format.getMaximumFractionDigits());
            System.out.println(format.format(valor));
            format.setMaximumFractionDigits(2);
            System.out.println(format.format(valor));
        }
    }
}
