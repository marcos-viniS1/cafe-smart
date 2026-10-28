package com.cafesmart.propriedade;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "talhoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Talhao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String variedade;
    private Double areaHectares;
    private Integer anoPlantio;
    private String espacamento;

    @ManyToOne
    @JoinColumn(name = "lavoura_id", nullable = false)
    private Lavoura lavoura;
}