package br.com.maratonajava.javacore.Bintroducaometodos.domain;

public class ImprimirDados {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.setName("Neymar");
        funcionario.setAge(29);
        funcionario.setSalary(new double []{1200, 2865.87, 4768.54});

        funcionario.imprime();
        funcionario.mediaSalarial();
    }
}
