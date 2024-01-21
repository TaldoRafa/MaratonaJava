package academy.devdojo.maratonajava.javacore.Eblocosiicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
        for (int episodio : this.episodios) {
            System.out.print(episodio + " ");
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }
}
