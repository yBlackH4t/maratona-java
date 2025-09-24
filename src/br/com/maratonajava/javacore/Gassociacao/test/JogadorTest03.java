package br.com.maratonajava.javacore.Gassociacao.test;

import br.com.maratonajava.javacore.Gassociacao.domain.Jogador;
import br.com.maratonajava.javacore.Gassociacao.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        // Teste de associação bidirecional
        Jogador jogador = new Jogador("Neymar");
        Jogador jogador1 = new Jogador("Di Maria");
        Time time = new Time("PSG");
        Jogador[] jogadores = {jogador, jogador1};

        // Associação bidirecional
        jogador.setTime(time);
        jogador1.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("----- Jogador -----");
        jogador.imprime();
        jogador1.imprime();
        System.out.println("----- Time -----");
        time.imprime();
    }
}
