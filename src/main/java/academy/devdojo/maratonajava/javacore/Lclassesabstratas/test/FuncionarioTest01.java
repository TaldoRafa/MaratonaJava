package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente funcionario02 = new Gerente("Cleber", 5000);
        Desenvolvedor desenvolvedor01 = new Desenvolvedor("Rafa", 12000);

        System.out.println(funcionario02);
        System.out.println(desenvolvedor01);
        funcionario02.imprime();
        desenvolvedor01.imprime();
    }
}
