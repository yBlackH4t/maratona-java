package br.com.maratonajava.javacore.Gassociacao.domain;

public class Jogador {
    private String nome;
    private Time time;

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Time: " + (time != null ? time.getNome() : "Sem time"));
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
