package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1;
        estudante1 = new Estudante();

        Estudante estudante2;
        estudante2 = new Estudante();

        estudante1.nome = "Rafa";
        estudante1.idade = 18;
        estudante1.sexo = 'M';

        estudante2.nome = "Luiz";
        estudante2.idade = 23;
        estudante2.sexo = 'M';

        estudante1.imprime();
        estudante2.imprime();
    }
}
