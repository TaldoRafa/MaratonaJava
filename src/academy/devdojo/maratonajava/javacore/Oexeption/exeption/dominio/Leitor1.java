package academy.devdojo.maratonajava.javacore.Oexeption.exeption.dominio;

import java.io.Closeable;
import java.io.IOException;

public class Leitor1 implements Closeable {
    public void close() throws IOException {
        System.out.println("Fechando leitor 1");
    }
}
