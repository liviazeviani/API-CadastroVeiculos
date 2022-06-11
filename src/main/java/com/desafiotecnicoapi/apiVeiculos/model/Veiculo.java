package com.desafiotecnicoapi.apiVeiculos.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity

public class Veiculo implements Serializable {

    @Id
    @Column(name = "id-veiculo")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;


    @Column(name = "Nome", nullable = false)
    private String Nome;

    @Column(name = "Marca")
    private String Marca;

    @Column(name = "Modelo")
    private String Modelo;

    @Column(name = "Data de Fabricação")
    private LocalDate DataFabrica;

    @Column(name = "Consumo médio de combustível em rodovias")
    private Long ConsumoRod;

    @Column(name = "Consumo médio de combustível em cidades")
    private Long ConsumoCid;
}

