package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest05 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("Gomu", "Gomu", "No", "mi"));
        String[] letters = words.getFirst().split("");
        System.out.println(Arrays.toString(letters));

        List<String[]> collect = words.stream().map(w -> w.split("")).toList();
        Stream<String> stream = Arrays.stream(letters);
        List<String> leters2 = words.stream().map(w -> w.split("")).flatMap(Arrays::stream).toList();
        System.out.println(leters2);
    }
}
