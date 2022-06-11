package com.desafiotecnicoapi.apiVeiculos.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;


@Service
public class ConsumoServiceImpl implements ConsumoService {
    @Override
    public BigDecimal computeTotalPreco(BigDecimal preco, BigDecimal combustivelConsumido) {
        return preco * combustivelConsumido;
    }


    @Override
    public BigDecimal computeUso(BigDecimal distancia, BigDecimal consumoMedio) {
        return distancia / consumoMedio;
    }
}
