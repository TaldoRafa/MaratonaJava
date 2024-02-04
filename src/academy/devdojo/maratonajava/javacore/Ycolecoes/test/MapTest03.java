package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor01 = new Consumidor("Carlão");
        Consumidor consumidor02 = new Consumidor("Pedro");

        Manga manga1 = new Manga(5L, "Berserk", 19.9);
        Manga manga2 = new Manga(1L, "Hellsing", 9.5);
        Manga manga3 = new Manga(4L, "Pokemon", 3.2);
        Manga manga4 = new Manga(3L, "Attack on titan", 11.20);
        Manga manga5 = new Manga(2L, "Dragon ball Z", 2.99);

        List<Manga> mangaListConsumidor1 = List.of(manga1, manga2, manga3);
        List<Manga> mangaListConsumidor2 = List.of(manga3, manga4);

        Map<Consumidor, List<Manga>> consumidorManga = new HashMap<>();

        consumidorManga.put(consumidor01, mangaListConsumidor1);
        consumidorManga.put(consumidor02, mangaListConsumidor2);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorManga.entrySet()) {
            System.out.print(entry.getKey().getNome() + " : ");
            for (Manga manga : entry.getValue()) {
                System.out.print(manga.getNome() + ", ");
            }
            System.out.println(" ");
        }
    }
}
