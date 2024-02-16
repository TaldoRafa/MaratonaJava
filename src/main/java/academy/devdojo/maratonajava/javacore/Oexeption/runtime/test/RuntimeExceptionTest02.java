package academy.devdojo.maratonajava.javacore.Oexeption.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            System.out.println(divisao(1, 0));
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("Codigo finalizado");
    }

    private static int divisao(int a, int b) throws IllegalArgumentException {
        if (b == 0 || a == 0) {
            throw new IllegalArgumentException("Argumento ilegal, os valores devem ser diferentes de 0");
        }

        return a / b;
    }
}
