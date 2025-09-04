package br.com.maratonajava.introducao;

public class Aula06EstruturasRepeticaoExercicoBreak {
    public static void main(String[] args) {
        //Dado um valor de um carro em quantas vezes ele pode ser parcelado
        //Condição é que o valor da parcela tem que ser igual maior que 1000

        double valorCarro = 30000;

        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela: " + parcela + " R$" + valorParcela);
        }

    }

}
