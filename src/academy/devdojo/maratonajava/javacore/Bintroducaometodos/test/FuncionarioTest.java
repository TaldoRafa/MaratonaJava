package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();

        funcionario01.nome = "Cleber";
        funcionario01.idade = 45;
        //funcionario01.salarios = new double[]{1500.54, 1600.46, 1589};

        funcionario01.imprime();
        funcionario01.mediaSalarios();
    }
}
