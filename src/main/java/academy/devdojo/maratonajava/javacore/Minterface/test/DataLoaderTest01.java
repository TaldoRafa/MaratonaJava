package academy.devdojo.maratonajava.javacore.Minterface.test;

import academy.devdojo.maratonajava.javacore.Minterface.dominio.DataLoader;
import academy.devdojo.maratonajava.javacore.Minterface.dominio.DatabaseLoader;
import academy.devdojo.maratonajava.javacore.Minterface.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader01 = new DatabaseLoader();
        FileLoader fileLoader01 = new FileLoader();

        databaseLoader01.load();
        fileLoader01.load();

        databaseLoader01.remove();
        fileLoader01.remove();

        databaseLoader01.checkPermission();
        fileLoader01.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
}
