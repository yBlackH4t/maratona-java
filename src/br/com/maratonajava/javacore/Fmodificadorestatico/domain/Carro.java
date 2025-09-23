package br.com.maratonajava.javacore.Fmodificadorestatico.domain;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;

    public Carro(){
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeLimite = velocidadeLimite;
    }
    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        if (velocidadeMaxima > velocidadeLimite) {
            this.velocidadeMaxima = velocidadeLimite;
        } else {
            this.velocidadeMaxima = velocidadeMaxima;
        }
    }

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Máxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade Limite: " + velocidadeLimite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        if (velocidadeMaxima > velocidadeLimite) {
            this.velocidadeMaxima = velocidadeLimite;
        } else {
            this.velocidadeMaxima = velocidadeMaxima;
        }
    }

    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }
}
