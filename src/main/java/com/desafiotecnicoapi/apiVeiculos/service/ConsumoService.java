package com.desafiotecnicoapi.apiVeiculos.service;


import java.math.BigDecimal;

public interface ConsumoService {
    BigDecimal computeTotalPreco(BigDecimal totalPreco, BigDecimal combustivelConsumido);
    float computeUso(BigDecimal distancia, BigDecimal consumoMedio);
}
}

