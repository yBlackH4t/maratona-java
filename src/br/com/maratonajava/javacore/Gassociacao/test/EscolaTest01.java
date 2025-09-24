package br.com.maratonajava.javacore.Gassociacao.test;

import br.com.maratonajava.javacore.Gassociacao.domain.Professor;
import br.com.maratonajava.javacore.Gassociacao.domain.Escola;

public class EscolaTest01 {
    public static void main(String[] args) {
        // Teste de associação entre Escola e Professor
        // Criação de professores
        Professor professor1 = new Professor("Severus Snape");
        Professor professor2 = new Professor("Minerva McGonagall");
        Professor professor3 = new Professor("Rubeus Hagrid");

        Escola escola = new Escola("Escola de Hogwarts", new Professor[]{professor1, professor2, professor3});
        escola.imprime();


    }
}