package com.Model;

import java.time.LocalDate;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class despesaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String tipoDespesa;
    private String Descricao;
    private double Valor;
    private LocalDate DataDespesa;
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getTipoDespesa() {
        return tipoDespesa;
    }
    public void setTipoDespesa(String tipoDespesa) {
        this.tipoDespesa = tipoDespesa;
    }
    public String getDescricao() {
        return Descricao;
    }
    public void setDescricao(String descricao) {
        Descricao = descricao;
    }
    public double getValor() {
        return Valor;
    }
    public void setValor(double valor) {
        Valor = valor;
    }
    public LocalDate getDataDespesa() {
        return DataDespesa;
    }
    public void setDataDespesa(LocalDate dataDespesa) {
        DataDespesa = dataDespesa;
    }
    
}
