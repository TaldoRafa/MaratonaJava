package academy.devdojo.maratonajava.javacore.ZZDoptional.repositorio;

import academy.devdojo.maratonajava.javacore.ZZDoptional.domain.Manga;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangas = new ArrayList<>(List.of(new Manga(1, "Boku no hero", 50), new Manga(2, "Overlord", 25)));

    public static Optional<Manga> findById(Integer id) {
        return serach(m -> m.getId().equals(id));
    }

    public static Optional<Manga> findByTitle(String title) {
        return serach(m -> m.getTitle().equals(title));
    }

    private static Optional<Manga> serach(Predicate<Manga> predicate) {
        Manga found = null;
        for (Manga manga : mangas) {
            if (predicate.test(manga)) {
                found = manga;
            }
        }
        return Optional.ofNullable(found);
    }
}
