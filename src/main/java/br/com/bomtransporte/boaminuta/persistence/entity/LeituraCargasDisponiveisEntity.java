package br.com.bomtransporte.boaminuta.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;
@Entity(name = "leitura_cargas_disponiveis")
@Data
public class LeituraCargasDisponiveisEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idView;
    private LocalDateTime dataLeitura;

}
