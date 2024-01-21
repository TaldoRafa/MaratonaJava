package academy.testes.listadetarefas.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Tarefa {
    private String titulo;
    private String descricao;
    private LocalDate dataConclusao;
    private final LocalDateTime dataTarefaCriada = LocalDateTime.now();

    @Override
    public String toString() {
        return "Tarefa{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataConclusao=" + dataConclusao +
                ", dataTarefaCriada=" + dataTarefaCriada +
                '}';
    }

    public Tarefa(String titulo, String descricao, LocalDate dataConclusao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataConclusao = dataConclusao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(LocalDate dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public LocalDateTime getDataTarefaCriada() {
        return dataTarefaCriada;
    }
}
