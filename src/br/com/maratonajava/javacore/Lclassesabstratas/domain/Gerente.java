package br.com.maratonajava.javacore.Lclassesabstratas.domain;

public class Gerente extends Funcionario{

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void bonus() {
        this.salario = this.salario + this.salario * 0.10;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
