package academy.devdojo.maratonajava.javacore.Heranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Dentro do bloco estatico de funcionario");
    }

    {
        System.out.println("Dentro do bloco de funcionario 1");
    }

    {
        System.out.println("Dentro do bloco de funcionario 2");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor funcionario");
    }

    public Funcionario(String nome, String cpf) {
        super(nome, cpf);
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu " + this.nome + " recebi o salario de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
