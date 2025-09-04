package br.com.maratonajava.introducao;

public class Aula04EstruturasRepeticaoExercicosFor {
    public static void main(String[] args) {
        //Imprimia todos os numeros pares de 0 até 1000000

        for (int i = 0; i <= 1000000 ; ++i) {
            if (i % 2 == 0) {
                System.out.println("Numero par: " + i);
            }
        }


    }
}
