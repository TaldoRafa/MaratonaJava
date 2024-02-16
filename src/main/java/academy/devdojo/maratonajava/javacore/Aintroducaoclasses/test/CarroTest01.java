package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro[] carros = new Carro[]{new Carro(), new Carro()};

        carros[0].name = "Corsa";

        System.out.println(carros[0].name);
    }
}
