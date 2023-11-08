package br.com.bomtransporte.boaminuta.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity(name = "detalhe_carga_arquivo")
@Data
public class DetalheCargaArquivoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = Integer.MAX_VALUE)
    private String arquivo;

    private Long codigoFilial;

    private Long codigoCarga;

    private LocalDateTime dataRecebimento;
}
