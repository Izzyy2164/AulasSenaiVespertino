package com.controller;

import org.springframework.web.bind.annotation.RestController;

import com.Model.VeiculoModel;
import com.Repository.VeiculoRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;





@RestController
public class veiculoController {

    @Autowired
    private VeiculoRepository veiculoRepository;

    @PostMapping("cadastrarveiculo")
    public VeiculoModel cadastrarveiculo(@RequestBody VeiculoModel veiculo ) {
        return veiculoRepository.save(veiculo);
    }
    
    @GetMapping("/listarveiculos")
    public List<VeiculoModel> listarveiculos() {
        return veiculoRepository.findAll();
    }
    

    @PutMapping("modificarveiculo/{id}")
    public VeiculoModel modificaveiculo(@PathVariable String id, @RequestBody VeiculoModel veiculo) {
        return veiculoRepository.save(veiculo);
    }
    
    @DeleteMapping("apagarveiculo/{id}")
    public void apagaveiculo(@PathVariable String id){
         veiculoRepository.deleteById(id);
        }

        @GetMapping("/calculargasto")
        public double calculargasto(@RequestParam double litros, @RequestParam double precoPorLitro) {
            return litros * precoPorLitro;
        }
        
    
}
