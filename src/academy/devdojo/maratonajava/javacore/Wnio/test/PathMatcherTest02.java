package academy.devdojo.maratonajava.javacore.Wnio.test;

import academy.devdojo.maratonajava.javacore.Wnio.domain.ListAllFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathMatcherTest02 {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get(".");
        Files.walkFileTree(root, new ListAllFiles());
    }
}
