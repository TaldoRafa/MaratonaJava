package academy.testes.arvoredebusca.test;

import academy.testes.arvoredebusca.dominio.Arvore;

public class ArvoreTest {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();

        arvore.inserirNumero();
        arvore.inserirNumero();
        arvore.imprimirArvoreOrdem();
    }
}
