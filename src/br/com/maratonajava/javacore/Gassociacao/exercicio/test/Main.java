package br.com.maratonajava.javacore.Gassociacao.exercicio.test;

import br.com.maratonajava.javacore.Gassociacao.exercicio.domain.Aluno;
import br.com.maratonajava.javacore.Gassociacao.exercicio.domain.Local;
import br.com.maratonajava.javacore.Gassociacao.exercicio.domain.Professor;
import br.com.maratonajava.javacore.Gassociacao.exercicio.domain.Seminario;

/*
        O sistema deverá cadastrar seminários, estudantes, professores e local onde será realizado.

        um aluno poderá estar em apenas um seminário
        um seminário poderá ter nenhum ou vários alunos
        um professor poderá ministrar vários seminários
        um seminário deve ter um local

        Campos básicos (excluindo relacionamento)
        seminário: título
        aluno: nome, idade
        professor: nome, especialidade
        local: endereço
*/

public class Main {
    public static void main(String[] args) {

        Local local = new Local("Rua 1, Centro, São Paulo - SP");
        Professor professor = new Professor("Marcos", "Programação");
        Aluno aluno = new Aluno("Ana", 19);
        Aluno aluno1 = new Aluno("Bia", 21);
        Aluno[] alunoParaSeminario = {aluno, aluno1};


        Seminario seminario = new Seminario("\nPython Avançado", alunoParaSeminario, local);
        Seminario seminario1 = new Seminario("\nJava Avançado", alunoParaSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario, seminario1};

        professor.setSeminarios(seminariosDisponiveis);
        professor.imprime();

    }
}
