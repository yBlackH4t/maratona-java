package br.com.maratonajava.introducao;

public class Aula05EstruturasRepeticaoBreak {
    public static void main(String[] args) {
        //Imprima os primeiros 25 numero de um valor. Exemplo 50
        int valorMax = 50;

        for (int i = 1; i <= valorMax; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }


    }
}
