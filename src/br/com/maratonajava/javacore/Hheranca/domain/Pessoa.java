package br.com.maratonajava.javacore.Hheranca.domain;

public class Pessoa {
    protected String nome;
    protected int idade;
    protected Endereco endereco;

    static {
        System.out.println("Pessoa inicializado no bloco Estatico");
    }

    {
        System.out.println("Pessoa inicializado no bloco inicialização 01");
    }

    {
        System.out.println("Pessoa inicializado no bloco inicialização 02");
    }

    public Pessoa(String nome) {
        System.out.println("Dentro do  construtor Pessoa");
        this.nome = nome;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

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
