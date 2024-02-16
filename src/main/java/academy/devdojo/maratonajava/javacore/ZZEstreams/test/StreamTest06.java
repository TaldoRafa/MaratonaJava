package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
    private static List<LightNovel> list = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 10.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("Noi Game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));

    public static void main(String[] args) {
        System.out.println(list.stream().anyMatch(ln -> ln.getPrice() > 8));
        System.out.println(list.stream().anyMatch(ln -> ln.getPrice() > 0));
        System.out.println(list.stream().noneMatch(ln -> ln.getPrice() < 0));
        list.stream().filter(ln -> ln.getPrice() > 3).findAny().ifPresent(System.out::println);
        list.stream().filter(ln -> ln.getPrice() > 3).max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
    }
}
