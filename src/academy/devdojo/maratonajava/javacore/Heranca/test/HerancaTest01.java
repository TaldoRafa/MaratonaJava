package academy.devdojo.maratonajava.javacore.Heranca.test;

import academy.devdojo.maratonajava.javacore.Heranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Heranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Heranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");

        Pessoa pessoa = new Pessoa("Rafael R", "123456789-12");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("\n-----------\n");

        Funcionario funcionario = new Funcionario("Carlão", "123456789-21");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2000.45D);
        funcionario.imprime();
        funcionario.relatorioPagamento();
    }
}
