package com.Servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Repository.VeiculoRepository;

@Service
public interface ServicoVeiculo {

    @Autowired
    private VeiculoRepository veiculorepository;
    
}
