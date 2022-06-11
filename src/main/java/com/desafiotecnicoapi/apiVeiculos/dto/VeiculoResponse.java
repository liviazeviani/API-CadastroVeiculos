package com.desafiotecnicoapi.apiVeiculos.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class VeiculoResponse {


    private UUID id;
    private String nome;
    private String marca;
    private String modelo;
    private LocalDate dataFabrica;
    private Float consumoCid;
    private Float consumoRod;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Float combustivelConsumido;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Float total;


    public VeiculoResponse(UUID id, String nome, String marca, String modelo, LocalDate dataFabrica,
                           Float consumoCid, Float consumoRod) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.dataFabrica = dataFabrica ;
        this.consumoCid = consumoCid;
        this.consumoRod = consumoRod;
    }

    public VeiculoResponse(UUID id, String nome, String marca, String modelo, LocalDate dataFabrica, BigDecimal consumoRod, BigDecimal consumoCid) {
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

    public Float getConsumoCid() {
        return consumoCid;
    }

    public Float getConsumoRod() {
        return consumoRod;
    }

    public Float getCombustivelConsumido() {
        Float combustivelConsumido = null;
        return combustivelConsumido;
    }

    public static void setCombustivelConsumido(Float combustivelConsumido) {
        this.combustivelConsumido = combustivelConsumido;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    @Override
    public int compareTo(Object o) {
        VeiculoResponse other = (VeiculoResponse) o;
        if (other == null) return 0;
        if (this.getTotal() > other.getTotal()) {
            return 1;
        } else if (this.getTotal() < other.getTotal()) {
            return -1;
        }
        return 0;
    }
}

