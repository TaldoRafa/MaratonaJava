package academy.testes.arvoredebusca.dominio;

import java.util.Scanner;

public class Arvore {
    private final No RAIZ;

    {
        RAIZ = new No();
    }

    public void imprime() {
        System.out.println(RAIZ.getValor());
        System.out.println(RAIZ.getDireita());
        System.out.println(RAIZ.getEsquerda());
    }

    public void inserirNumero() throws IllegalArgumentException {
        Integer num = pegaIntConsole();

        No temp = RAIZ;

        if (temp.getValor() == null) {
            temp.setValor(num);
        } else {
            No NoNovo = new No(num);

            while (temp != null) {
                if (num < temp.getValor()) {
                    if (temp.getEsquerda() == null) {
                        temp.setEsquerda(NoNovo);
                        break;
                    } else {
                        temp = temp.getEsquerda();
                    }
                } else if (num > temp.getValor()) {
                    if (temp.getDireita() == null) {
                        temp.setDireita(NoNovo);
                        break;
                    } else {
                        temp = temp.getDireita();
                    }
                } else {
                    throw new IllegalArgumentException("Valor ja existe na arvore");
                }
            }
        }
    }

    public void deleteNumber() throws IllegalArgumentException {
        No temp = RAIZ;
    }

    public void imprimirArvoreOrdem() {
        if (RAIZ.getValor() == null) {
            throw new RuntimeException("Não ha valores na arvore!");
        } else {
            imprimirNo(RAIZ);
        }
    }

    private void imprimirNo(No noAtual) {
        if (noAtual != null) {
            imprimirNo(noAtual.getEsquerda());
            System.out.println(noAtual.getValor());
            imprimirNo(noAtual.getDireita());
        }
    }

    private Integer pegaIntConsole() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um valor inteiro para adicionar: ");
        return scanner.nextInt();
    }
}
