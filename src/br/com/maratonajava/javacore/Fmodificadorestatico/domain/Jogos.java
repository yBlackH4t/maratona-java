package br.com.maratonajava.javacore.Fmodificadorestatico.domain;


public class Jogos {
    private String nome;
    private static int[] colecoes;
    // 0 - Bloco de inicialização é executado quando a JVM carregar a classe
    // 1° - Aloca um espaço em memória
    // 2° - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
    // 3° - Bloco de inicialização é executado
    // 4° - Construtor Executado

    static {
        System.out.println("Dentro do bloco de inicilizacao estatico");
        colecoes = new int[100];
        for (int i = 0; i < colecoes.length; i++) {
            colecoes[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do segundo bloco de inicializacao estatico 2");
    }

    {
        System.out.println("Dentro do bloco de inicializacao");
    }

    public Jogos(String nome) {
        this.nome = nome;
    }

    public Jogos() {
        for (int colecao : Jogos.colecoes) {
            System.out.print(colecao + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getColecoes() {
        return colecoes;
    }
}
