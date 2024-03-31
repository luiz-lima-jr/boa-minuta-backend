package br.com.bomtransporte.boaminuta.persistence.entity;

import br.com.bomtransporte.boaminuta.enuns.FobCifEnum;
import br.com.bomtransporte.boaminuta.enuns.PagamentoPedagioEnum;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity(name = "frete")
@Data
public class FreteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "filialId")
    private FilialEntity filial;

    @NotNull
    private Long numeroCarga;

    @NotNull
    private boolean faturado;

    //@NotNull
    private Integer entregas;

    @NotNull
    private Double m3;

    //@NotNull
    private Double volumes;

    //@NotNull
    private String complemento;

    @OneToMany(mappedBy = "frete", cascade = CascadeType.ALL)
    private List<PedidoEntity> pedidos;

    @NotNull
    private LocalDateTime dataSaida;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "filialOrigemId")
    private FilialEntity municipioOrigem;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "municipioDestinoId")
    private MunicipioEntity municipioDestino;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "caminhaoId")
    @NotNull
    private CaminhaoEntity caminhao;

    @NotNull
    private Double valorCarga;

    @NotNull
    private Double pedagio;

    @NotNull
    private Double complementoCalculo;

    //@NotNull
    private Double descontos;

    @NotNull
    private Double frete;

    @NotNull
    @Enumerated(EnumType.STRING)
    private FobCifEnum fobCif;

    @NotNull
    @Enumerated(EnumType.STRING)
    private PagamentoPedagioEnum pagamentoPedagio;

    @NotNull
    private Double nfse;

    @NotNull
    private Double fretePago;

    @NotNull
    private Double iss;

    @NotNull
    private Double pisCofins;

    @NotNull
    private Double icms;

    @NotNull
    private Double custos;

    @NotNull
    private Double irCs;

    @NotNull
    private Double saldo;

    @NotNull
    private Double margem;

    @NotNull
    private Double markup;

    private String observacoes;

    private boolean paletizado;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dataLimiteCarregamento;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dataLiberacaoFaturamento;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dataImpressaoMinuta;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuarioResponsavelOperacionalId")
    @NotNull
    private UsuarioEntity responsavelOperacional;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuarioResponsavelFaturamentoId")
    private UsuarioEntity responsavelFaturamento;

    @Transient
    public double totalImpostos(){
        return pisCofins;
    }


}
