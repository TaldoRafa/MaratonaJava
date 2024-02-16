package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {
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
        System.out.println(list.stream().count());
        System.out.println(list.stream().collect(Collectors.counting()));

        list.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
        list.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))).ifPresent(System.out::println);

        System.out.println(list.stream().mapToDouble(LightNovel::getPrice).sum());
        System.out.println(list.stream().collect(Collectors.summingDouble(LightNovel::getPrice)));

        list.stream().mapToDouble(LightNovel::getPrice).average().ifPresent(System.out::println);
        System.out.println(list.stream().collect(Collectors.averagingDouble(LightNovel::getPrice)));

        DoubleSummaryStatistics collect = list.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(collect);

        String title = list.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(title);
    }
}
