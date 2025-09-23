package br.com.maratonajava.javacore.Aintroducaoclasses.test;

import br.com.maratonajava.javacore.Aintroducaoclasses.domain.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Rafael";
        estudante.idade = 39;
        estudante.sexo = 'M';

        System.out.println("Nome: " + estudante.nome + " Idade: " + estudante.idade + " Sexo:" + estudante.sexo);
    }
}
