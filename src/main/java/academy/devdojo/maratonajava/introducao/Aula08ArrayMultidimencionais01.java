package academy.devdojo.maratonajava.introducao;

public class Aula08ArrayMultidimencionais01 {
    public static void main(String[] args) {
        int[][] numeros = new int[3][3];
        int[][] numeros2 = new int[3][];

        numeros2[0] = new int[]{1, 2};
        numeros2[1] = new int[]{1, 2, 3};
        numeros2[2] = new int[]{1, 2, 3, 4, 5, 6};

        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3;
        numeros[1][0] = 4;
        numeros[1][1] = 5;
        numeros[1][2] = 6;
        numeros[2][0] = 7;
        numeros[2][1] = 8;
        numeros[2][2] = 9;

        for (int[] numero : numeros) {
            for (int i : numero) {
                System.out.println(i);
            }
        }

        for (int[] numero : numeros2) {
            for (int i : numero) {
                System.out.println(i);
            }
        }
    }
}
