package br.com.bomtransporte.boaminuta.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "role")
@Data
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true)
    private String name;
}
