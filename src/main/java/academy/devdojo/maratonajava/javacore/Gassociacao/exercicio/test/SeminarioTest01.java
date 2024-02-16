package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.domain.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.domain.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.domain.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.domain.Seminario;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Local local01 = new Local("Rua das graças");
        Aluno aluno01 = new Aluno("Rafael", 18);
        Professor professor01 = new Professor("Barba Branca", "Pirata");
        Seminario seminario01 = new Seminario("Onde achar one pice", new Aluno[]{aluno01}, local01);

        professor01.setSeminariosParaMinistrar(new Seminario[]{seminario01});
        aluno01.setSeminario(seminario01);

        professor01.imprime();
    }
}
