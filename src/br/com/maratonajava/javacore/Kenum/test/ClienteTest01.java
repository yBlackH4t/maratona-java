package br.com.maratonajava.javacore.Kenum.test;

import br.com.maratonajava.javacore.Kenum.domain.Cliente;
import br.com.maratonajava.javacore.Kenum.domain.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Joao", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Pedro", TipoCliente.PESSOA_FISICA);
        Cliente cliente3 = new Cliente("Thiago", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente4 = new Cliente("Jose",  TipoCliente.PESSOA_JURIDICA);
        Cliente cliente5 = new Cliente("Paulo", TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
        System.out.println(cliente5);


    }
}
