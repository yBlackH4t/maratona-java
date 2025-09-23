package br.com.maratonajava.javacore.Eblocosdeinicializacao.domain;


public class Jogos {
    private String nome;
    private int[] colecoes;

    // 1° - Aloca um espaço em memória
    // 2° - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
    // 3° - Bloco de inicializacao é executado
    // 4° - Construtor Executado

    {
        System.out.println("Dentro do bloco de inicilizacao");
        colecoes = new int[100];
        for (int i = 0; i < colecoes.length; i++) {
            colecoes[i] = i + 1;
        }
    }

    public Jogos(String nome) {
        this.nome = nome;
    }

    public Jogos() {
        for (int colecao : this.colecoes) {
            System.out.print(colecao + " ");
        }
        System.out.println();
    }

    public int[] getColecoes() {
        return colecoes;
    }

    public String getNome() {
        return nome;
    }
}
