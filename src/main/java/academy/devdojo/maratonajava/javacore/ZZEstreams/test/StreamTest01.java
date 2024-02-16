package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest01 {
    private static List<LightNovel> list = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("Noi Game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));

    public static void main(String[] args) {
        list.sort(Comparator.comparing(LightNovel::getTitle));

        List<String> titles = new ArrayList<>();
        for (LightNovel lightNovel : list) {
            if (lightNovel.getPrice() <= 4) {
                if (titles.size() >= 3) break;
                titles.add(lightNovel.getTitle());
            }
        }
        System.out.println(titles);
    }
}
