package academy.devdojo.maratonajava.javacore.Oexeption.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao();
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            //throw new RuntimeException();
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo sistema operacional");
        }
        return null;
    }

    private static void abreConexao2() {
        try {
            System.out.println("Abrindo arquivo");
            //throw new RuntimeException();
            System.out.println("Escrevendo dados no arquivo");
        } finally {
            System.out.println("Fechando recurso liberado pelo sistema operacional");
        }
    }
}
