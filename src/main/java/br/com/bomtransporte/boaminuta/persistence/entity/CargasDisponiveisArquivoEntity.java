package br.com.bomtransporte.boaminuta.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Entity(name = "cargas_disponiveis_arquivo")
@Data
public class CargasDisponiveisArquivoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String arquivo;

    private Long codigoFilial;

    private LocalDateTime dataRecebimento;
}
