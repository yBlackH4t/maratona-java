package br.com.maratonajava.introducao;

public class Aula09ArraysMultidimensionais {
    public static void main(String[] args) {

        //1,2,3,4,5 Meses
        //31,28,31,30 Dias
/*
        int[][] dias = new int[3][3];

        dias[0][0] = 50;
        dias[0][1] = 51;
        dias[0][2] = 52;

        dias[1][0] = 100;
        dias[1][1] = 101;
        dias[1][2] = 102;

        dias[2][0] = 501;
        dias[2][1] = 502;
        dias[2][2] = 503;


        //Utilizando o fori para arrayMulti
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
*/

/*
        //Utilizando o foreach para arrayMulti
        for (int[] arrBase : dias){
            for (int num : arrBase){
                System.out.println(num);
            }
        }
*/

        //Inicializando com outra forma

        int[][] idades = new int [2][];

        idades[0] = new int[]{88,88};
        idades[1] = new int[]{54,97,34};

        for (int[] arrBase : idades){
            System.out.println("\n-----");
            for (int num : arrBase ){
                System.out.print(num + " ");
            }
        }


    }
}
