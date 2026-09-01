package com.digipet.care.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;

@Entity
@Table(name = "servico")
@Getter @Setter @NoArgsConstructor
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "clinica_id", nullable = false)
    private Long clinicaId;

    @Column(nullable = false)
    private String nome;

    private String tipo;
    private Integer duracao; // em minutos

    @Column(name = "preco_base")
    private BigDecimal precoBase;

    private boolean ativo = true;
}