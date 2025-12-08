package br.com.maratonajava.javacore.Minterfaces.domain;

public class DataBaseLoader implements DataLoader, DataRemove {

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados");
    }

    public static void retriveMaxDataLoader(){
        System.out.println("Recuperando dados dentro do DataBaseLoader");
    }

    public void checkPermission() {
        System.out.println("Checando permissao do banco de dados");
    }
}
