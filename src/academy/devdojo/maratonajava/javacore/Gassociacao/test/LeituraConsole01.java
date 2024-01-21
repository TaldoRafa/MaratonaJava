package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraConsole01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String text = input.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();

        System.out.print("Digite M ou F para seu sexo: ");
        char sexo = input.next().charAt(0);

        System.out.println(text);
        System.out.println(idade);
        System.out.println(sexo);
    }
}
