package br.com.maratonajava.javacore.Lclassesabstratas.domain;

public class Desenvolvedor extends Gerente{
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
