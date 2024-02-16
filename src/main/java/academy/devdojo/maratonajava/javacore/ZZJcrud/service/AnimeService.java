package academy.devdojo.maratonajava.javacore.ZZJcrud.service;


import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZJcrud.repository.ProducerRepository;

import java.util.Optional;
import java.util.Scanner;

public class ProducerService {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void menu(int op) {
        switch (op) {
            case 1 -> findByName();
            case 2 -> delete();
            case 3 -> save();
            case 4 -> update();
            default -> throw new IllegalArgumentException("Not a valid option");
        }
    }

    private static void findByName() {
        System.out.print("Type the name or empty to all: ");
        String name = SCANNER.nextLine();

        ProducerRepository.findByName(name).forEach(p -> System.out.printf("[%d] - %s \n", p.getId(), p.getName()));
    }

    private static void delete() {
        System.out.println("Type the id producer you want to delete");
        int id = SCANNER.nextInt();
        System.out.println("Are you sure? Y/N");
        String choice = new Scanner(System.in).nextLine();
        if ("Y".equalsIgnoreCase(choice)) ProducerRepository.delete(id);
    }

    private static void save() {
        System.out.println("Type name of the producer");
        String name = new Scanner(System.in).nextLine();
        Producer producer = Producer.builder().name(name).build();

        ProducerRepository.save(producer);
    }

    private static void update() {
        System.out.println("Type the id of the object you want to update");
        Optional<Producer> producerOptional = ProducerRepository.findById(new Scanner(System.in).nextInt());
        if (producerOptional.isEmpty()) {
            System.out.println("Producer not found");
            return;
        }
        Producer producerFromDb = producerOptional.get();
        System.out.println("Producer found " + producerFromDb);

        System.out.println("Type the name or enter to keep the same");
        String name = new Scanner(System.in).nextLine();

        name = name.isEmpty() ? producerFromDb.getName() : name;
        Producer producerToUpdate = Producer.builder().id(producerFromDb.getId()).name(name).build();

        ProducerRepository.update(producerToUpdate);
    }
}
