package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Rafa"; // String constant pool
        String nome2 = "Rafa";

        nome = nome.concat(" Roani");

        System.out.println(nome);
        System.out.println(nome == nome2);

        String nome3 = new String("Rafa"); // não usar
        System.out.println(nome2 == nome3.intern());
    }
}
