package br.com.maratonajava.javacore.Kenum.domain;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    public final int codigo;
    public final String descricao;

    TipoCliente(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public static TipoCliente tipoClientePorAtributo(String descricao){
        for (TipoCliente v : values()) {
            if (v.getDescricao().equals(descricao)){
                return v;
            }
        }
        return null;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
}
