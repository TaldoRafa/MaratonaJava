package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.domain;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminariosParaMinistrar;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminariosParaMinistrar) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminariosParaMinistrar = seminariosParaMinistrar;
    }

    public void imprime() {
        System.out.println("---------");
        System.out.println("Professor: " + this.nome);

        if (this.seminariosParaMinistrar == null) return;
        System.out.println("## Seminarios cadastrados ##");
        for (Seminario seminario : this.seminariosParaMinistrar) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereco());
            if (seminario.getAlunos() == null || seminario.getAlunos().length == 0) continue;
            System.out.println("** Alunos **");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno: " + aluno.getNome() + " Idade: " + aluno.getIdade());
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminariosParaMinistrar() {
        return seminariosParaMinistrar;
    }

    public void setSeminariosParaMinistrar(Seminario[] seminariosParaMinistrar) {
        this.seminariosParaMinistrar = seminariosParaMinistrar;
    }
}
