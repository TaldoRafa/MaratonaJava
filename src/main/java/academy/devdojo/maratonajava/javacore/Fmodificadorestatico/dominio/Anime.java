package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    static {
        System.out.println("Passou aq");
        Anime.episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }

    }

    public Anime() {
        
    }

    public Anime(String nome) {
        this.nome = nome;
    }
}
