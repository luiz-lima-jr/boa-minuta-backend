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
    @JoinColumn(name = "tipo_aliquota_id")
    private TipoAliquotaEntity tipoAliquota;

    @ManyToOne
    @JoinColumn(name = "estado_origem_id")
    private EstadoEntity estadoOrigem;

    @ManyToOne
    @JoinColumn(name = "estado_destino_id")
    private EstadoEntity estadoDestino;

    @ManyToOne
    @JoinColumn(name = "filial_id")
    private FilialEntity filial;

    private Double aliquota;

}
