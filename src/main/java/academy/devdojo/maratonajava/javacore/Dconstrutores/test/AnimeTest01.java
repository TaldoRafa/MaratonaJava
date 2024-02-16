package academy.devdojo.maratonajava.javacore.Dconstrutores.test;


import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime("Akuma Drive", "TV", 12, "Ação");
        // anime1.init("Akuma Drive", "TV", 12);
        anime1.imprime();
    }
}
