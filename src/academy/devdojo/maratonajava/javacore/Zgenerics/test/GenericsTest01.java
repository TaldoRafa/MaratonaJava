package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("test 01");
        list.add("test 02");

        for (String s : list) {
            System.out.println(s);
        }

    }
}
