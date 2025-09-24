package br.com.maratonajava.javacore.Gassociacao.test;

import br.com.maratonajava.javacore.Gassociacao.domain.Jogador;
import br.com.maratonajava.javacore.Gassociacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Neymar");
        Time time1 = new Time("PSG");

        jogador1.setTime(time1);
        jogador1.imprime();

    }
}
