package br.com.maratonajava.javacore.Gassociacao.test;

import br.com.maratonajava.javacore.Gassociacao.domain.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Neymar");
        Jogador jogador2 = new Jogador("Messi");
        Jogador jogador3 = new Jogador("Cristiano Ronaldo");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }

    }
}
