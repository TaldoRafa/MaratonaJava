package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta2/new.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime modifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime accessTime = basicFileAttributes.lastAccessTime();

        System.out.println(creationTime);
        System.out.println(modifiedTime);
        System.out.println(accessTime);

        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(modifiedTime, newCreationTime, creationTime);

        System.out.println("------------------------");

        creationTime = fileAttributeView.readAttributes().creationTime();
        modifiedTime = fileAttributeView.readAttributes().lastModifiedTime();
        accessTime = fileAttributeView.readAttributes().lastAccessTime();

        System.out.println(creationTime);
        System.out.println(modifiedTime);
        System.out.println(accessTime);
    }
}
