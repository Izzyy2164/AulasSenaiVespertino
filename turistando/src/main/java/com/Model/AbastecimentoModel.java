package com.Model;

import java.util.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToOne;


@Entity
public class AbastecimentoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IdAbastecimento;

    @OneToOne
    private  VeiculoModel veiculo;

    private Date data;
    private double QuantidadeLitros;
    private double ValorTotal;

    public long getIdAbastecimento() {
        return IdAbastecimento;
    }
    public void setIdAbastecimento(long idAbastecimento) {
        IdAbastecimento = idAbastecimento;
    }
    public VeiculoModel getVeiculo() {
        return veiculo;
    }
    public void setVeiculo(VeiculoModel veiculo) {
        this.veiculo = veiculo;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public double getQuantidadeLitros() {
        return QuantidadeLitros;
    }
    public void setQuantidadeLitros(double quantidadeLitros) {
        QuantidadeLitros = quantidadeLitros;
    }
    public double getValorTotal() {
        return ValorTotal;
    }
    public void setValorTotal(double valorTotal) {
        ValorTotal = valorTotal;
    }

    }
