package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor01 = new Professor("Jiraya uai");
        Professor professor02 = new Professor("Cleiton Racha");

        Escola escola01 = new Escola("Escolinha do prof raimundo", new Professor[]{professor01, professor02});

        escola01.imprime();
    }
}
