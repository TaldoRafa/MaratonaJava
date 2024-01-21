package academy.testes.listadetarefas.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class ListaDeTarefas {
    private ArrayList<Tarefa> tarefas = new ArrayList<>();

    @Override
    public String toString() {
        return "ListaDeTarefas{" +
                "tarefas=" + Arrays.toString(new ArrayList[]{tarefas}) +
                '}';
    }

    public void addTarefa(String titulo, String descricao, int diasParaVencer) {
        LocalDate date = LocalDate.now().plusDays(diasParaVencer);
        Tarefa tarefa = new Tarefa(titulo, descricao, date);

        this.tarefas.add(tarefa);
    }
}
