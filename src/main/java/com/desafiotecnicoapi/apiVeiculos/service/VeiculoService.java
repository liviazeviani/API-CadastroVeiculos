package com.desafiotecnicoapi.apiVeiculos.service;

import com.desafiotecnicoapi.apiVeiculos.dto.VeiculoResponse;
import com.desafiotecnicoapi.apiVeiculos.model.Veiculo;

import java.math.BigDecimal;
import java.util.List;

public interface VeiculoService {


        VeiculoResponse insert(Veiculo veiculo);
        List<VeiculoResponse> compute(BigDecimal preco, BigDecimal cidade, BigDecimal rodovia);
    }

