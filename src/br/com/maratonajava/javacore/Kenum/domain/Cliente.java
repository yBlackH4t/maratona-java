package br.com.maratonajava.javacore.Kenum.domain;

public class Cliente {
    private String nome;
    private TipoCliente tipoCliente;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente(String nome, TipoCliente tipoCliente){
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
