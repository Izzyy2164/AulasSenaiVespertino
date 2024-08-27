package com.Servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Model.despesaModel;
import com.Repository.DespesaRepository;
import com.Repository.VeiculoRepository;




@Service
public class ServicoDespesa {

    @Autowired
    private DespesaRepository despesarepository;

    @Autowired
    private VeiculoRepository veiculoRepository;


    public List<despesaModel>listardespesaveiculos (long veiculoid){
        return despesarepository.findByVeiculoId(veiculoid);
    }

    public DespesaModel salvarDespesa(despesaModel despesaVeiculo) {
        return DespesaRepository.save(despesarepository);
    }

    public List<despesaModel> buscarDespesaPorId(Long veiculoid) {
        return despesarepository.findByVeiculoId(veiculoid);
    }    


}
