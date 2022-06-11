package com.desafiotecnicoapi.apiVeiculos.model;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Veiculo {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "ID", updatable = false, nullable = false)
    @ColumnDefault("random_uuid()")
    @Type(type = "uuid-char")
    private UUID id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "make")
    private String make;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "manufactureDate")
    private LocalDate dataFabrica;

    @Column(name = "consumoCid")
    private BigDecimal consumoCid;

    @Column(name = "consumoRod")
    private BigDecimal consumoRod;

    public Veiculo(UUID id, String nome, String make, String modelo,
                   LocalDate dataFabrica, Float consumoCid, Float consumoRod) {
        this.id = id;
        this.nome = nome;
        this.make = make;
        this.modelo = modelo;
        this.dataFabrica = dataFabrica;
        this.consumoCid = consumoCid;
        this.consumoRod = consumoRod;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDate getDataFabrica() {
        return dataFabrica;
    }

    public void setDataFabrica(LocalDate dataFabrica) {
        this.dataFabrica = dataFabrica;
    }

    public BigDecimal getConsumoCid() {
        return consumoCid;
    }

    public void setConsumoCid(BigDecimal consumoCid) {
        this.consumoCid = consumoCid;
    }

    public BigDecimal getConsumoRod() {
        return consumoRod;
    }

    public void setConsumoRod(BigDecimal consumoRod) {
        this.consumoRod = consumoRod;
    }
}