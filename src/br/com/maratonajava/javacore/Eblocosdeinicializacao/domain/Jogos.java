package br.com.maratonajava.javacore.Eblocosdeinicializacao.domain;


public class Jogos {
    private String nome;
    private int[] colecao = {1, 2, 3, 4, 5, 6, 7, 8};

    // 1° - Aloca um espaço em memória
    // 2° - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
    // 3° - Bloco de inicializacao é executado
    // 4° - Construtor Executado

    {
        System.out.println("Dentro do bloco de inicilizacao");
        colecao = new int[100];
        for (int i = 0; i < colecao.length; i++) {
            colecao[i] = i+1;
        }
    }

    public Jogos(String nome) {
        this.nome = nome;
    }

    public Jogos() {
        for (int colecao : this.colecao) {
            System.out.print(colecao + " ");
        }
        System.out.println();
    }

    public int[] getColecao() {
        return colecao;
    }

    public String getNome() {
        return nome;
    }
}
