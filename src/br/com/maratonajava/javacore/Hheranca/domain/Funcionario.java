package br.com.maratonajava.javacore.Hheranca.domain;

public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Funcionario inicializado no bloco Estatico");
    }

    {
        System.out.println("Funcionario inicializado no bloco inicialização 01");
    }

    {
        System.out.println("Funcionario inicializado no bloco inicialização 02");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor Funcionario");
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu " + this.nome + " declaro que recebi meu salrio no valor de: " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
