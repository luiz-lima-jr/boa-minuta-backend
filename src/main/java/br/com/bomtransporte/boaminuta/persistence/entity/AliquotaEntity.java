package br.com.bomtransporte.boaminuta.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "aliquota")
@Data
public class AliquotaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    @JoinColumn(name = "tipoAliquotaId")
    private TipoAliquotaEntity tipoAliquota;

    @ManyToOne
    @JoinColumn(name = "estadoOrigemId")
    private EstadoEntity estadoOrigem;

    @ManyToOne
    @JoinColumn(name = "estadoDestinoId")
    private EstadoEntity estadoDestino;

    @ManyToOne
    @JoinColumn(name = "filialId")
    private FilialEntity filial;

    private Double aliquota;

}
