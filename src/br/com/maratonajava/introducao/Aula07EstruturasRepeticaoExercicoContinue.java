package br.com.maratonajava.introducao;

public class Aula07EstruturasRepeticaoExercicoContinue {
    public static void main(String[] args) {
        //Crie um programa que use um for para imprimir os números de 1 a 10, mas não imprima o número 5 (use continue para pular).
/*
        for (int i = 0; i <= 10; i++) {
            if (i == 5)
                continue;
            System.out.println(i);
        }
*/

        //Use continue para pular os números pares e imprimir somente os ímpares entre 1 e 20.
 /*
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }
 */
        //Crie um loop de 1 a 30, e use continue para ignorar os números que não são múltiplos de 3.

        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
