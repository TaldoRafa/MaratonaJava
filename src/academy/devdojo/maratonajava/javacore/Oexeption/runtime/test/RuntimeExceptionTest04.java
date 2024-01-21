package academy.devdojo.maratonajava.javacore.Oexeption.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        // as exeções mais expecificas devem ficar sempre acima
        try {
            throw new IndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catch 1");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Catch 2");
        } catch (IllegalArgumentException e) {
            System.out.println("Catch 3");
        } catch (ArithmeticException e) {
            System.out.println("Catch 4");
        } catch (RuntimeException e) {
            System.out.println("Catch 5");
        }

        try {
            talvezLanceException();
        } catch (SQLException | FileNotFoundException e) {
            System.out.println("Catch SQL");
            e.printStackTrace();
        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }
}
