package br.com.bomtransporte.boaminuta.persistenceMili.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity(name = "VW_XML_MILI_CARGAS")
@Data
public class DetalheCargaArquivoEntity {

    @Id
    @Column(name="SEQ_XML_MILI_CARGAS")
    private Long id;

    @Column(length = Integer.MAX_VALUE, name="DS_XML_RETORNO")
    private String arquivo;

    @Column(name="EFTCODIGO")
    private Long eftCodigo;

    @Column(name="NRCARGA")
    private Long codigoCarga;

    @Column(name="DT_REGISTRO")
    private LocalDateTime dataRecebimento;
}
