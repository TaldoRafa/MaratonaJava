package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo o que não for digito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-z A-Z, digitos, _
        // \W = Tudo que não for \w
        // []
        // ? = Zero ou uma
        // + = Zero ou mais
        // * = Uma ou mais
        // {n, m} de n ate m
        // ()
        // |
        // $
        // . 1.3 = 123, 133, 1@3, 1A3, ...
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, test@gmail.com.br, sakura@mail";
        System.out.println("#@!zoro@mail.br".matches(regex));
        System.out.println(texto.split(", ")[1].trim());
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto: " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group() + " ");
        }

        // int numeroHex = 0xDD976E;
        // System.out.println(numeroHex);
    }
}
