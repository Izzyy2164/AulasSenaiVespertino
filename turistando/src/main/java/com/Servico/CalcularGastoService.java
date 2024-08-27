package com.Servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Model.VeiculoModel;
import com.Repository.VeiculoRepository;

@Service
public class CalcularGastoService {

    @Autowired
    private VeiculoRepository veiculorepository;

    public double CalcularGastoModel(long veiculo){
        VeiculoModel veiculomodel = VeiculoRepository.findById(veiculoid)
        .orElseThrow(() => new RuntimeException("veiculo não encontrado"));

        double consumo = veiculo.get.quilometragemFinal()- veiculo.getQuilometragemInicial();
        double gastoCombustivel = veiculo.getLitrosCombustivel() * veiculo.getValorCombustivel();
        return gastoCombustivel();
    }
}
