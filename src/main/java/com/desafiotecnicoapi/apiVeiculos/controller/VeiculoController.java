package com.desafiotecnicoapi.apiVeiculos.controller;

import com.desafiotecnicoapi.apiVeiculos.dto.VeiculoRequest;
import com.desafiotecnicoapi.apiVeiculos.dto.VeiculoResponse;
import com.desafiotecnicoapi.apiVeiculos.mappers.VeiculoMapper;
import com.desafiotecnicoapi.apiVeiculos.service.VeiculoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController {

    private final VeiculoService veiculoService;

    private final VeiculoMapper veiculoMapper;

    public VeiculoController(VeiculoService veiculoService, VeiculoMapper veiculoMapper) {
        this.veiculoService = veiculoService;
        this.veiculoMapper = veiculoMapper;
    }

    @PostMapping
    public ResponseEntity<VeiculoResponse> insert(@RequestBody VeiculoRequest veiculo) {
        VeiculoResponse savedVeiculo = veiculoService.insert(veiculoMapper.toEntity(veiculo));

        return new ResponseEntity<>(savedVeiculo, HttpStatus.CREATED);
    }

    @GetMapping(value = "/lista")
    public ResponseEntity<List<VeiculoResponse>> compute(@RequestParam("preço") BigDecimal preco, @RequestParam("consumo na cidade") float cidade, @RequestParam("consumo na rodovia") float rodovia) {
        List<VeiculoResponse> dto = veiculoService.compute(preco, cidade, rodovia);

        return new ResponseEntity<>(dto, HttpStatus.OK);
    }
}