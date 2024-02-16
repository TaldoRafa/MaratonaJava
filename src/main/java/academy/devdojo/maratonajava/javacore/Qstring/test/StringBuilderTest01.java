package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Rafael Roani";
        nome.concat("DevDojo");
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Rafael Roani");
        sb.append(" Gonçalves");
        System.out.println(sb);
    }
}
