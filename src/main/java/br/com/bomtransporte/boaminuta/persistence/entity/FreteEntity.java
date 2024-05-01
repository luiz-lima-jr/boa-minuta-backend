package br.com.bomtransporte.boaminuta.persistence.entity;

import br.com.bomtransporte.boaminuta.enuns.FobCifEnum;
import br.com.bomtransporte.boaminuta.enuns.PagamentoPedagioEnum;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Entity(name = "frete")
@Data
public class FreteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "filialId")
    private FilialEntity filial;

    @NotNull
    private Long numeroCarga;

    @NotNull
    private boolean faturado;

    private boolean freteCalculado;

    //@NotNull
    private Integer entregas;

    private Double m3;

    private Double volumes;

    private String complemento;

    @OneToMany(mappedBy = "frete", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private List<PedidoEntity> pedidos;

    private LocalDateTime dataSaida;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "filialOrigemId")
    private FilialEntity municipioOrigem;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "municipioDestinoId")
    private MunicipioEntity municipioDestino;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "caminhaoId")
    private CaminhaoEntity caminhao;

    private Double valorCarga;

    private Double pedagio;

    private Double complementoCalculo;

    private Double descontos;

    private Double frete;

    @Enumerated(EnumType.STRING)
    private FobCifEnum fobCif;

    @Enumerated(EnumType.STRING)
    private PagamentoPedagioEnum pagamentoPedagio;

    private Double nfse;

    private Double fretePago;

    private Double iss;

    private Double pisCofins;

    private Double icms;

    private Double custos;

    private Double irCs;

    private Double saldo;

    private Double margem;

    private Double markup;

    @Column(columnDefinition="VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_bin")
    private String observacoes;

    private String placa;

    private boolean paletizado;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dataLimiteCarregamento;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dataLiberacaoFaturamento;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dataImpressaoMinuta;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuarioResponsavelOperacionalId")
    private UsuarioEntity responsavelOperacional;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuarioResponsavelFaturamentoId")
    private UsuarioEntity responsavelFaturamento;


    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY )
    @JoinTable(name = "cliente_frete",
            joinColumns = { @JoinColumn(name = "freteId") },
            inverseJoinColumns = {@JoinColumn(name = "clienteId")}
    )
    private Set<ClienteEntity> clientes;


    @Transient
    private Double aliquotaIss;
    @Transient
    private Double aliquotaPisCofins;
    @Transient
    private Double aliquotaCustos;
    @Transient
    private Double aliquotaIrcs;
    @Transient
    private Double aliquotaIcms;
    @Transient
    public double totalImpostos(){
        return pisCofins;
    }
}
