package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraConsole02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("O grande software de previsão do futuro");
        System.out.println("Digite sua pergunta e eu responderei Sim ou Não");
        String pergunta = input.nextLine();

        if (pergunta.charAt(0) == ' ') {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }
    }
}
