package br.com.maratonajava.introducao;

public class Aula01EstruturasCondicionais {
    public static void main(String[] args) {
        byte diaDaSemana = 7;
        String nomeDia;
        char sexo = 'M';
        String genero;

        switch (diaDaSemana) {
            case 1:
                nomeDia = "Segunda-Feira";
                break;
            case 2:
                nomeDia = "Terça-Feira";
                break;
            case 3:
                nomeDia = "Quarta-Feira";
                break;
            case 4:
                nomeDia = "Quinta-Feira";
                break;
            case 5:
                nomeDia = "Sexta-Feira";
                break;
            case 6:
                nomeDia = "Sabado";
                break;
            case 7:
                nomeDia = "Domingo";
                break;
            default:
                nomeDia = "Dia Inválido";
                break;
        }

        switch (sexo){
            case 'F':
                genero = "Mulher";
                break;
            case 'M':
                genero = "Homem";
                break;
            default:
                genero = "Genero invaldio";
                break;
        }

        System.out.println(nomeDia);
        System.out.println(genero);

    }
}
