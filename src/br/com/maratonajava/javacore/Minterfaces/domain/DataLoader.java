package br.com.maratonajava.javacore.Minterfaces.domain;

public interface DataLoader {
    // Não precisa escrever 'public abstract', o Java já sabe!
    void load();

    default void checkPermission() {
        System.out.println("Checando permissao...");
    }

    static void retriveMaxDataLoader(){
        System.out.println("Recuperando dados do DataLoader");
    }
}
