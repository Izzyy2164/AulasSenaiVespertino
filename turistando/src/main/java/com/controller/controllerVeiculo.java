package com.controller;

import org.springframework.web.bind.annotation.RestController;

import com.Model.VeiculoModel;
import com.Repository.VeiculoRepository;
import com.Servico.ServicoVeiculo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/veiculos")

public class controllerVeiculo {

    @Autowired
    private VeiculoRepository veiculorepository;

    @GetMapping
    public List<VeiculoModel> listarTodos(){
        return veiculorepository.findAll();
        }

        @GetMapping("/id")
        public ResponseEntity<VeiculoModel>buscar(@PathVariable Long id){
            return  VeiculoRepository.findByVeiculoId(id);
            .map(ResponseEntity:ok)
            .orElse(ResponseEntity.notFound().build());
        }
        @PostMapping("/id")
        public ResponseEntity<VeiculoModel>atualizar(@PathVariable Long id,@RequestBody VeiculoModel veiculoModel){
            return veiculorepository.findById(id);

            .map(registro -> registro.setMarca(veiculo.getMarca()));
            registro.setModelo(veiculo.getModelo());
            registro.setAnoFabricacao(getAnoFabricacao());
            Veiculo atualizado = veiculorepository.save(registro);
            .orElse(@ResponseEntity.notFound().build());

            return ResponseEntity.ok(atualizado);
            
            
        }

        @DeleteMapping("/id")
        public ResponseEntity void deletar(@PathVariable Long id){
            return veiculorepository.findById(id)
            .map(registro -> veiculoRepository.deleteById(id);
            .orElse(RequestEntity.notFound().build());
            return ResponseEntity.noContent().build());
        
        }

        @Autowired
        private ServicoVeiculo servicoveiculo;

        @GetMapping("gasto-combustivel")
        public ResponseEntity<Double> CalcularGastoModel(@PathVariable long id){
            double gastoCombustivel = servicoveiculo.CalcularGastoModel(id);
            return ResponseEntity.ok(gastoCombustivel);
            
        }

        @Autowired
        private ServicoVeiculo servicoVeiculo;

        @PostMapping
        public ResponseEntity<veiculo>

}
