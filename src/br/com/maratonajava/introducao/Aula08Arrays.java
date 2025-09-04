package br.com.maratonajava.introducao;

public class Aula08Arrays {
    public static void main(String[] args) {
        //byte, float, int, double, long, short = 0
        //char '\u0000' ' '
        //String null
        //boolean false

/*
        int[] idade = new int[3];
        System.out.println(idade[0]);
        System.out.println(idade[1]);
        System.out.println(idade[2]);
*/


/*
        //Arrays Padrão
        String[] nomes = new String[3];
        nomes[0] = "Giovanna";
        nomes[1] = "Guilherme";
        nomes[2] = "Evania";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes [i]);
        }
*/

        //Array foreach com inicializaão diferente
        int[] idade = {15,14,13};

        for (int num : idade ){
            System.out.println(num);
        }


    }
}
