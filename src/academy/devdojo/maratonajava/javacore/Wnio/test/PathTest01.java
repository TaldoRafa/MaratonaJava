package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Codding\\Java\\maratona-java\\file.txt");
        Path p2 = Paths.get("C:\\Codding\\Java\\maratona-java", "file.txt");
        System.out.println(p1.getFileName());
    }
}
