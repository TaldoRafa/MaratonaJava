package academy.devdojo.maratonajava.javacore.ZZJcrud.service;


import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZJcrud.repository.AnimeRepository;

import java.util.Optional;
import java.util.Scanner;

public class AnimeService {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void menu(int op) {
        switch (op) {
            case 1 -> findByName();
            case 2 -> delete();
            case 3 -> save();
            case 4 -> update();
        }
    }

    private static void findByName() {
        System.out.print("Type the name or empty to all: ");
        String name = SCANNER.nextLine();

        AnimeRepository.findByName(name).forEach(p -> System.out.printf("[%d] - %s %d %s \n", p.getId(), p.getName(), p.getEpisodes(), p.getProducer().getName()));
    }

    private static void delete() {
        System.out.println("Type the id anime you want to delete");
        int id = SCANNER.nextInt();
        System.out.println("Are you sure? Y/N");
        String choice = new Scanner(System.in).nextLine();
        if ("Y".equalsIgnoreCase(choice)) AnimeRepository.delete(id);
    }

    private static void save() {
        System.out.println("Type name of the anime");
        String name = new Scanner(System.in).nextLine();

        System.out.println("Type the number of episodes");
        int episodes = new Scanner(System.in).nextInt();

        System.out.println("Type the id of the producer");
        int producerId = new Scanner(System.in).nextInt();

        Anime anime = Anime.builder().name(name).episodes(episodes).producer(Producer.builder().id(producerId).build()).build();
        AnimeRepository.save(anime);
    }

    private static void update() {
        System.out.println("Type the id of the object you want to update");
        Optional<Anime> animeOptional = AnimeRepository.findById(new Scanner(System.in).nextInt());
        if (animeOptional.isEmpty()) {
            System.out.println("Anime not found");
            return;
        }
        Anime animeFromDb = animeOptional.get();
        System.out.println("Anime found " + animeFromDb);

        System.out.println("Type the name or enter to keep the same");
        String name = new Scanner(System.in).nextLine();
        name = name.isEmpty() ? animeFromDb.getName() : name;

        System.out.println("Type the new number of episodes enter to keep the same");
        int episodes = new Scanner(System.in).nextInt();

        Anime animeToUpdate = Anime.builder().id(animeFromDb.getId()).episodes(episodes).name(name).producer(animeFromDb.getProducer()).build();

        AnimeRepository.update(animeToUpdate);
    }
}
