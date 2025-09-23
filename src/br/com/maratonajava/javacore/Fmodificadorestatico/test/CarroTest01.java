package br.com.maratonajava.javacore.Fmodificadorestatico.test;


import br.com.maratonajava.javacore.Fmodificadorestatico.domain.Carro;

import java.util.Scanner;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro c1 = new Carro("BMW", 290);
        Carro c2 = new Carro("Audi", 260);
        Carro c3 = new Carro("Mercedes", 280);

        System.out.println("Digite a velocidade limite para todos os carros: ");
        Scanner scanner = new Scanner(System.in);
        double velocidadeLimite = scanner.nextDouble();
        Carro.setVelocidadeLimite(velocidadeLimite);
        scanner.close();

        c1.imprime();
        c2.imprime();
        c3.imprime();

    }
}
