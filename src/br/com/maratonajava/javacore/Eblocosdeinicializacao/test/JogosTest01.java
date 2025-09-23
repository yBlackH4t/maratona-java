package br.com.maratonajava.javacore.Eblocosdeinicializacao.test;

import br.com.maratonajava.javacore.Eblocosdeinicializacao.domain.Jogos;

public class JogosTest01 {
    public static void main(String[] args) {
        Jogos jogos = new Jogos("Call of duty");

        for (int colecao : jogos.getColecoes()) {
            System.out.print(colecao + " ");
        }


    }
}
