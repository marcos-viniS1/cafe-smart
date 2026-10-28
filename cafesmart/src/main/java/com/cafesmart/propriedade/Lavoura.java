package com.cafesmart.propriedade;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Table(name = "lavouras")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Lavoura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToOne
    @JoinColumn(name = "propriedade_id", nullable = false)
    private Propriedade propriedade;

    @OneToMany(mappedBy = "lavoura", cascade = CascadeType.ALL)
    private List<Talhao> talhoes;
}