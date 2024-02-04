package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.List;

public class StreamTest07 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        list.stream().reduce((x, y) -> x + y).ifPresent(System.out::println);
        Integer reduce = list.stream().reduce(1, (x, y) -> x + y);
        System.out.println(reduce);

        list.stream().reduce(Integer::sum).ifPresent(System.out::println);

        System.out.println(list.stream().reduce(1, (x, y) -> x * y));
        list.stream().reduce((x, y) -> x > y ? x : y).ifPresent(System.out::println);
        list.stream().reduce(Integer::max).ifPresent(System.out::println);
    }
}
