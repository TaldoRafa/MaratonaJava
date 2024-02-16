package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

final class Anime {
    private final String nome;

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

public class CopyOnWriteTest01 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 2000; i++) {
            list.add(i);
        }

        Runnable runnableiterator = () -> {
            Iterator<Integer> iterator = list.iterator();
            try {
                TimeUnit.SECONDS.sleep(2);
                iterator.forEachRemaining(System.out::println);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Runnable runnableRemove = () -> {
            for (int i = 0; i < 500; i++) {
                System.out.printf("%s removed %d \n", Thread.currentThread().getName(), i);
            }
        };

        new Thread(runnableiterator).start();
        new Thread(runnableiterator).start();
        new Thread(runnableRemove).start();
    }
}
