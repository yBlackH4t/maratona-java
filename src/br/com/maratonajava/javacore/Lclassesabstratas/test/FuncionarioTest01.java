package br.com.maratonajava.javacore.Lclassesabstratas.test;

import br.com.maratonajava.javacore.Lclassesabstratas.domain.Desenvolvedor;
import br.com.maratonajava.javacore.Lclassesabstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Amaral", 15000);
        System.out.println(gerente);
        gerente.imprime();

        Desenvolvedor desenvolvedor = new Desenvolvedor("DevDojo", 300000);
        System.out.println(desenvolvedor);
        desenvolvedor.imprime();

    }
}
