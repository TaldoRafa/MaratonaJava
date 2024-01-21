package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        int[] numeros = new int[3];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        for (int numero : numeros) {
            System.out.println(numero);
        }

        int[] numeros2 = new int[]{1, 2, 3, 4, 5};

        for (int j : numeros2) {
            System.out.println(j);
        }
    }
}
