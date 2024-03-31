package br.com.bomtransporte.boaminuta.persistenceMili.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity(name = "VW_XML_MILI")
@Data
public class CargasDisponiveisArquivoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="SEQ_XML_MILI")
    private Long id;

    @Column(name="DS_XML")
    private String arquivo;

    @Column(name="ID_FILIAL_MILI")
    private Long codigoFilial;

    @Column(name="DT_REGISTRO")
    private LocalDateTime dataRegistro;
}
