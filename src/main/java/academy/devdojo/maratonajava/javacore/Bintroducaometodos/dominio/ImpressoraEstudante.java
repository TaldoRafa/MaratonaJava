package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante) {
        System.out.println(estudante.nome + " " + estudante.idade + " " + estudante.sexo);
    }
}
