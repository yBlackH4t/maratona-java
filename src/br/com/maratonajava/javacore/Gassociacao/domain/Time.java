package br.com.maratonajava.javacore.Gassociacao.domain;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public void imprime() {
        System.out.println("Nome do time: " + this.nome);
        System.out.println(jogadores == null ? "\nNenhum jogador cadastrado" : "\nJogadores: ");
        for (Jogador jogador : jogadores) {
            System.out.println(jogador.getNome());
        }
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
