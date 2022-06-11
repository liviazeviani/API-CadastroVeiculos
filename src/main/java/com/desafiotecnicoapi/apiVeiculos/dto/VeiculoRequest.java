package com.desafiotecnicoapi.apiVeiculos.dto;

import javax.persistence.Id;
import java.time.LocalDate;
import java.util.UUID;

public class VeiculoRequest {

    private final UUID id;
    private final String nome;
    private final String marca;
    private final String modelo;
    private final LocalDate dataFabrica;
    private final Float consumoRod;
    private final Float consumoCid;

    public VeiculoRequest(UUID id, String nome, String marca, String modelo,
                          LocalDate dataFabrica, Float consumoRod, Float consumoCid) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.dataFabrica = dataFabrica;
        this.consumoRod = consumoRod;
        this.consumoCid = consumoCid;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public LocalDate getDataFabrica() {
        return dataFabrica;
    }

    public Float getConsumoRod() {
        return consumoRod;
    }

    public Float getConsumoCid() {
        return consumoCid;
    }
}

