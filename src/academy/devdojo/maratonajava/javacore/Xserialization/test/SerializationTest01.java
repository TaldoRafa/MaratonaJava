package academy.devdojo.maratonajava.javacore.Xserialization.test;

import academy.devdojo.maratonajava.javacore.Xserialization.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Xserialization.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationTest01 {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno(1L, "Rafa", "123");
        Turma turma = new Turma("Turma boladona");
        aluno01.setTurma(turma);
        serializar(aluno01);
        deserializar();
    }

    private static void serializar(Aluno aluno) {
        Path path = Paths.get("pasta/aluno.ser");
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(path))) {
            objectOutputStream.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deserializar() {
        Path path = Paths.get("pasta/aluno.ser");
        try (ObjectInputStream objectInputStream = new ObjectInputStream(Files.newInputStream(path))) {
            Aluno aluno = (Aluno) objectInputStream.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
