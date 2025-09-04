package br.com.maratonajava.javacore.Bintroducaometodos.domain;

public class Funcionario {
    private String name;
    private int age;
    private double[] salary;
    private double media;

    public double[] getSalary() {
        return salary;
    }

    public void setSalary(double[] salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMedia() {
        return media;
    }

    public void imprime() {
        System.out.println(this.name);
        System.out.println(this.age);
        for (double salario : this.salary) {
            System.out.println(salario);
        }
    }

    public void mediaSalarial() {
        double media = 0;
        for (double salarios : salary){
            media += salarios;
        }
        media /= salary.length;
        System.out.println("Média salarial: " + media);
    }
}
