package br.com.bomtransporte.boaminuta.enuns;

public enum ExperienciaBomEnum {
    NOVO_PARA_CARREGAMENTO("Novo para Carregamento"),
    CARREGA_SEMPRE("Carregamento"),
    RETORNANDO("Retornando");

    private String desc;
    ExperienciaBomEnum(String desc){
        this.desc = desc;
    }

    public String getDesc(){
        return desc;
    }
}
