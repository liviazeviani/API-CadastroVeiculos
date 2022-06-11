package com.desafiotecnicoapi.apiVeiculos.service;


import java.math.BigDecimal;

public interface ConsumoService {
    BigDecimal computeTotalPreco(BigDecimal totalPreco, BigDecimal combustivelConsumido);
    BigDecimal computeUso(BigDecimal distancia, BigDecimal consumoMedio);
}
}

