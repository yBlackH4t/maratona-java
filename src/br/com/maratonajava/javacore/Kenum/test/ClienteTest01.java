package br.com.maratonajava.javacore.Kenum.test;

import br.com.maratonajava.javacore.Kenum.domain.Cliente;
import br.com.maratonajava.javacore.Kenum.domain.TipoCliente;
import br.com.maratonajava.javacore.Kenum.domain.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Joao", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Pedro", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getDescricao());

        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorAtributo("Pessoa Fisica2");
        System.out.println(tipoCliente2);

    }
}
