package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime() {
        System.out.println("Informações Funcionario:");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

        if (this.salarios == null) {
            System.out.println("ERROR! Não a salarios salvos");
            return;
        }
        System.out.print("Salarios: ");
        for (double sal : this.salarios) {
            System.out.print(sal + ", ");
        }
        System.out.println(" ");
    }

    public void mediaSalarios() {
        if (this.salarios == null) {
            System.out.println("ERROR! Não a salarios salvos");
            return;
        }

        double soma = 0;
        for (double sal : this.salarios) {
            soma += sal;
        }
        soma /= this.salarios.length;
        System.out.println("Media dos salarios: " + soma);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }
}
