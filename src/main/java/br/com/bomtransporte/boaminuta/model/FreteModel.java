package br.com.bomtransporte.boaminuta.model;

import br.com.bomtransporte.boaminuta.enuns.FobCifEnum;
import br.com.bomtransporte.boaminuta.enuns.PagamentoPedagioEnum;
import br.com.bomtransporte.boaminuta.persistence.entity.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Set;

@Data
public class FreteModel {

    private Long id;
    private Long numeroCarga;
    private String placa;
    private Double valorCarga;
    private Double m3;
    private Integer entregas;
    private MunicipioEntity municipioDestino;
    //mudei de municipioEntity para filialEntity porque o campo localCarregamento do XML é o numero da filial
    private FilialEntity municipioOrigem;
    private Integer volumes;
    private String complemento;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT")
    private LocalDateTime dataSaida;

    private CaminhaoEntity caminhao;
    private UsuarioModel responsavelFaturamento;
    private UsuarioModel responsavelOperacional;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dataLimiteCarregamento;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dataLiberacaoFaturamento;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dataImpressaoMinuta;
    private boolean paletizado;
    private FilialModel filial;
    private String observacoes;
    private Double pedagio;
    private Double complementoCalculo;
    private Double descontos;
    private Double frete;
    private FobCifEnum fobCif;
    private PagamentoPedagioEnum pagamentoPedagio;
    private Double nfse;
    private Double fretePago;
    private Double iss;

    private Double pisCofins;

    private Double icms;
    private Double irCs;
    private Double saldo;
    private Double margem;
    private Double markup;

    private Double aliquotaIss;
    private Double aliquotaPisCofins;
    private Double aliquotaCustos;
    private Double aliquotaIrcs;
    private Double aliquotaIcms;
    private Double custos;

    private Set<ClienteEntity> clientes;

    private boolean faturado;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FreteModel that = (FreteModel) o;
        return  Objects.equals(numeroCarga, that.numeroCarga) && Objects.equals(placa, that.placa) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroCarga, placa);
    }
}
