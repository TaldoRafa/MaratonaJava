package academy.devdojo.maratonajava.javacore.Wnio.domain;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class ListAllFiles extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (matches(file, "glob:**/*{Test*}.{java,class}")) {
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }

    private boolean matches(Path path, String glob) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        return matcher.matches(path);
    }
}
