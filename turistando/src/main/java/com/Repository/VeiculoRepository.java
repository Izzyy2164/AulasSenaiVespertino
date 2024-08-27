package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import com.Model.VeiculoModel;

    
public interface VeiculoRepository extends JpaRepository<VeiculoModel, String> {

    static ResponseEntity<VeiculoModel> findByVeiculoId(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByVeiculoId'");
    }

    
}
