package br.com.maratonajava.javacore.Hheranca.test;

import br.com.maratonajava.javacore.Hheranca.domain.Endereco;
import br.com.maratonajava.javacore.Hheranca.domain.Funcionario;
import br.com.maratonajava.javacore.Hheranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.setRua("Rua 1");
        endereco.setBairro("Bairro 2");
        endereco.setCidade("Cidade 3");

        Pessoa pessoa = new Pessoa("Neymar");
        pessoa.setIdade(20);
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("----HERANÇA----");

        Funcionario funcionario = new Funcionario("Guilherme");
        funcionario.setIdade(30);
        funcionario.setSalario(2000);
        funcionario.setEndereco(endereco);
        funcionario.imprime();
    }
}
