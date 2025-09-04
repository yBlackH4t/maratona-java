package br.com.maratonajava.introducao;

public class Aula00DevGuilhermeJava {
    public static void main(String[] args) {
         String categoria;
         int idade = 14;

         if (idade < 15){
             categoria = "infantil";
         } else if (idade >= 15 && idade < 18) {
             categoria = "juvenil";
         } else {
             categoria = "adulto";
         }
        System.out.println("Categoria: "+categoria);
    }
}
