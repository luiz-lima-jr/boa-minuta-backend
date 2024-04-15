package br.com.bomtransporte.boaminuta.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Entity(name = "leitura_detalhe_carga")
@Data
public class LeituraDetalheCargaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idView;
    private LocalDateTime dataLeitura;

}
