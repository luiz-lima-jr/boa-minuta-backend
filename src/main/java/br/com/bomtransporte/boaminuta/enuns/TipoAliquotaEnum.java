package br.com.bomtransporte.boaminuta.enuns;

public enum TipoAliquotaEnum {
    ICMS(1L),
    IRRF(2L),
    CUSTOS(3L),
    DISTRIBUICAO(4L),
    ISS(5L),
    PIS_COFINS(6L);

    private long id;
    TipoAliquotaEnum(long id){
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
