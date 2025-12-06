package br.com.maratonajava.javacore.Jmodificadorfinal.domain;

public class Empresa {
    private String nome;
    //static e final torna a varivael em uma constante, uma verdade absoluta para todo o programa
    public static final int QTD_FUNCIONARIOS = 2;
    public final Comprador COMPRADOR = new Comprador();

    public final void imprime(){
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
