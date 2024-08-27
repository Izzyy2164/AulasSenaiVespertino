package com.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Model.despesaModel;
import com.Servico.DespesaModel;

public interface DespesaRepository extends JpaRepository<despesaModel,Integer >{

    List<despesaModel> findByVeiculoId(long veiculoid);

    static DespesaModel save(DespesaRepository despesarepository) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

}
