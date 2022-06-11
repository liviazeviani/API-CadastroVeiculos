package com.desafiotecnicoapi.apiVeiculos.service;

import com.desafiotecnicoapi.apiVeiculos.dto.VeiculoResponse;
import com.desafiotecnicoapi.apiVeiculos.mappers.VeiculoMapper;
import com.desafiotecnicoapi.apiVeiculos.model.Veiculo;
import com.desafiotecnicoapi.apiVeiculos.repository.VeiculoRepository;
import org.springframework.stereotype.Service;


import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class VeiculoServiceImpl implements VeiculoService {

    private final VeiculoRepository veiculoRepository;

    private final VeiculoMapper veiculoMapper;

    private final ConsumoService consumoService;

    public VeiculoServiceImpl(VeiculoRepository veiculoRepository, VeiculoMapper veiculoMapper,
                              ConsumoService consumoService) {
        this.veiculoRepository = veiculoRepository;
        this.veiculoMapper = veiculoMapper;
        this.consumoService = consumoService;
    }

    @Override
    public VeiculoResponse insert(Veiculo veiculo) {
        Veiculo savedVeiculo = veiculoRepository.save(veiculo);

        return veiculoMapper.toDto(savedVeiculo);
    }

    @Override
    public List<VeiculoResponse> compute(BigDecimal preco, BigDecimal cidade, BigDecimal rodovia) {
        List<Veiculo> allVeiculo = veiculoRepository.findAll();


        List<VeiculoResponse> computedVeiculo = allVeiculo.stream().map(veiculo -> {
            float consumoRod = consumoService.computeUso(rodovia, veiculo.getConsumoRod());
            float consumoCid = consumoService.computeUso(cidade, veiculo.getConsumoCid());
            float totalPreco = consumoService.computeTotalPreco(preco, (consumoCid + consumoRod));

            VeiculoResponse veiculoResponse = veiculoMapper.toDto(veiculo);
            VeiculoResponse.setTotal(totalPreco);
            VeiculoResponse.setCombustivelConsumido( consumoCid + consumoRod);


            return veiculoResponse;
        }).collect(Collectors.toList());


        Collections.sort(computedVeiculo);

        return computedVeiculo;
    }
}