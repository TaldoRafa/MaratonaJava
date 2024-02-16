package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(300);
        List<String> nomes2 = new ArrayList<>(300);

        nomes.add("Rafa");
        nomes.add("outro nome");
        nomes2.add("Joao");
        nomes2.add("DevDojo");
        // nomes.remove("Rafa");
        nomes.addAll(nomes2);

        for (String nome : nomes) {
            System.out.println(nome);
        }


        System.out.println("------------------");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        System.out.println("------------------");

        System.out.println(nomes);
    }
}
