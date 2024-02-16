package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("Aha adaw");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();

        Optional<String> name = findName("Rafa");
        String empty = name.orElse("EMPTY");
        name.ifPresent(s -> System.out.println(s.toUpperCase()));
        System.out.println(empty);
    }

    private static Optional<String> findName(String name) {
        List<String> names = new ArrayList<>(List.of("Rafa", "DevDojo"));
        int i = names.indexOf(name);
        if (i != -1) {
            return Optional.of(names.get(i));
        }
        return Optional.empty();
    }
}
