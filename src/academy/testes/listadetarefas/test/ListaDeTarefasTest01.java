package academy.testes.listadetarefas.test;

import academy.testes.listadetarefas.domain.ListaDeTarefas;

public class ListaDeTarefasTest01 {
    public static void main(String[] args) {
        ListaDeTarefas lista1 = new ListaDeTarefas();

        lista1.addTarefa("Estudar", "estudar java e os conceitos basicos", 4);

        System.out.println(lista1);
    }
}
