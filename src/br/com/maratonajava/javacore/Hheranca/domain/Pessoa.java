package br.com.maratonajava.javacore.Hheranca.domain;

public class Pessoa {
    private String nome;
    private int idade;
    private Endereco endereco;

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (endereco != null) {
            System.out.println("Rua: " + this.endereco.getRua());
            System.out.println("Bairro: " + this.endereco.getBairro());
            System.out.println("Cidade: " + this.endereco.getCidade());
        }
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
