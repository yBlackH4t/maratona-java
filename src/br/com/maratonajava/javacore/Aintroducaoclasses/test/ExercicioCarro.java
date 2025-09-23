package br.com.maratonajava.javacore.Aintroducaoclasses.test;

import br.com.maratonajava.javacore.Aintroducaoclasses.domain.Carro;

public class ExercicioCarro {
    public static void main(String[] args) {

        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.nome = "Fusca Bala";
        carro01.modelo = "Sport";
        carro01.ano = 1968;

        carro02.nome = "Civic";
        carro02.modelo = "Sport";
        carro02.ano = 2025;

        System.out.println("Carro 01");
        System.out.println(carro01.nome);
        System.out.println(carro01.modelo);
        System.out.println(carro01.ano);

        System.out.println("\nCarro 02");
        System.out.println(carro02.nome);
        System.out.println(carro02.modelo);
        System.out.println(carro02.ano);
    }
}
