package br.com.bomtransporte.boaminuta.enuns;

public enum FuncaoEnum {
    ADMINISTRADOR("ADMINISTRADOR"),
    FATURISTA("FATURISTA"),
    OPERACIONAL("OPERACIONAL");

    private String descricao;

    FuncaoEnum(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}
