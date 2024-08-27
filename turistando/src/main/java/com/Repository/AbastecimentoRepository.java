package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Model.AbastecimentoModel;

public interface AbastecimentoRepository extends JpaRepository <AbastecimentoModel, Integer> {

}
