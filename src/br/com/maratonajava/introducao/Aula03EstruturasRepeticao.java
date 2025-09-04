package br.com.maratonajava.introducao;

public class Aula03EstruturasRepeticao {
    public static void main(String[] args) {
        //while, do-while, for
        int count = 5;

        while (count < 10) {
            System.out.println(count++);
        }
        count = 12;
        do {
            System.out.println("Te amo" + " " + ++count);
        } while (count < 10);
        {

        }

        for (int i = 0; i < 10; ++i) {
            System.out.println("For é: " + i);
        }
    }
}
