package br.com.maratonajava.javacore.Jmodificadorfinal.test;

import br.com.maratonajava.javacore.Jmodificadorfinal.domain.Comprador;
import br.com.maratonajava.javacore.Jmodificadorfinal.domain.Empresa;
import br.com.maratonajava.javacore.Jmodificadorfinal.domain.Microsoft;

public class EmpresaTest01 {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        System.out.println(Empresa.QTD_FUNCIONARIOS);
        System.out.println(empresa.COMPRADOR);
        empresa.COMPRADOR.setNome("Neymar");
        System.out.println(empresa.COMPRADOR);
        Microsoft microsoft = new Microsoft();
        microsoft.setNome("Ronaldinho");
        microsoft.imprime();


    }
}
