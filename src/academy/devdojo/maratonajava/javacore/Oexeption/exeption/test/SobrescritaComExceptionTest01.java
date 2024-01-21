package academy.devdojo.maratonajava.javacore.Oexeption.exeption.test;

import academy.devdojo.maratonajava.javacore.Oexeption.exeption.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Oexeption.exeption.dominio.LoginInvalidoException;
import academy.devdojo.maratonajava.javacore.Oexeption.exeption.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            pessoa.salvar();
            funcionario.salvar();
        } catch (FileNotFoundException | LoginInvalidoException e) {
            throw new RuntimeException(e);
        }

    }
}
