package br.com.maratonajava.javacore.Isobrescrita.domain;

public class Filme {
    private String titulo;

    public Filme(String titulo) {
        this.titulo = titulo;
    }
    @Override
    public String toString() {
        //Concatenação Simples
        //return "Filme: " + titulo;

        //String.format = printf
        return String.format("Filme: %s", titulo);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
