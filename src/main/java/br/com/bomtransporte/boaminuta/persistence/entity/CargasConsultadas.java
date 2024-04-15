package br.com.bomtransporte.boaminuta.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity(name = "cargas_consultadas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CargasConsultadas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "freteId")
    private FreteEntity frete;

    private Long idView;
    private LocalDateTime dataRegistro;

}
