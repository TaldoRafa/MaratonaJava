package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimeAcomparators = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeAcomparators.get();
        List<Anime> animeList = new java.util.ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One piece", 900), new Anime("Naruto", 500)));

        animeList.sort(animeComparators::compareByEpisodesNonEstatic);
        System.out.println(animeList);

        BiFunction<String, Integer, Anime> animeBiFunction = (s, i) -> new Anime(s, i);
        BiFunction<String, Integer, Anime> animeBiFunction2 = Anime::new;

        System.out.println(animeBiFunction2.apply("Super campeões", 36));
    }
}
