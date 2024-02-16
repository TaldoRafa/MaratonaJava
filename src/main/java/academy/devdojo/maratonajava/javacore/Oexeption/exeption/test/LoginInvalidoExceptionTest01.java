package academy.devdojo.maratonajava.javacore.Oexeption.exeption.test;

import academy.devdojo.maratonajava.javacore.Oexeption.exeption.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
            System.out.println("Usuario logado com sucesso!");
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner scanner = new Scanner(System.in);
        String usernameDB = "Rafa";
        String senhaDB = "1234";

        System.out.print("Usuario: ");
        String usernameIn = scanner.nextLine();

        System.out.print("Senha: ");
        String senhaIn = scanner.nextLine();

        if (!usernameDB.equals(usernameIn) || !senhaDB.equals(senhaIn)) {
            throw new LoginInvalidoException("Usuario ou senha inválidos");
        }
    }
}
