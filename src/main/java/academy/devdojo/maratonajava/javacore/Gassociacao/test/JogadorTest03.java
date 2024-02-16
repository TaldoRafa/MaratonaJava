package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Neymar");
        Jogador jogador02 = new Jogador("Pelé");
        Time time01 = new Time("Brasil");

        jogador01.setTime(time01);
        jogador02.setTime(time01);
        time01.setJogadores(new Jogador[]{jogador01, jogador02});

        System.out.println("--- Jogador ---");
        jogador01.imprime();
        jogador02.imprime();
        System.out.println("--- Time ---");
        time01.imprime();
    }
}
