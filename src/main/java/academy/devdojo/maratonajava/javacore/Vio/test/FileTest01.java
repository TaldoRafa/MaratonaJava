package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        boolean isCreated = false;
        File file = new File("file.txt");
        try {
            isCreated = file.createNewFile();
            boolean exists = file.exists();
            System.out.println("path " + file.getPath());
            System.out.println("path absolute " + file.getAbsolutePath());
            System.out.println("is directory " + file.isDirectory());
            System.out.println("is file " + file.isFile());
            System.out.println("is hidden " + file.isHidden());
            System.out.println("last modified " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));

            if (!exists) return;

            boolean delete = file.delete();
            System.out.println("Deletado");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println(isCreated);
        }
    }
}
