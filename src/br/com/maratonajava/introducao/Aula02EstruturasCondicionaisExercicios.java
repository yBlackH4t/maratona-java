package br.com.maratonajava.introducao;

public class Aula02EstruturasCondicionaisExercicios {
    public static void main(String[] args) {
        //Se o dia 1 é domingo, defina o restante dos dias da semana separando entre Final de semana e dia util



        byte dia = 7;
/*        String diaDaSemana;

        switch (dia){
            case 1:
            case 7:
                diaDaSemana = "Final de Semana";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                diaDaSemana = "Dia útil";
                break;
            default:
                diaDaSemana = "Opção inválida";
        }

        System.out.println(diaDaSemana);

         */

        String diaDaSemana = switch (dia) {
            case 1, 7 -> "Final de Semana";
            case 2, 3, 4, 5, 6 -> "Dia útil";
            default -> "Opção inválida";
        };

        System.out.println(diaDaSemana);


    }
}
