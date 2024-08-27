package com.Model;

public class CalcularGastoModel {

    private double precoPorLitro;
    private double litros;


    public double getPrecoPorLitro() {
        return precoPorLitro;
    }


    public void setPrecoPorLitro(double precoPorLitro) {
        this.precoPorLitro = precoPorLitro;
    }


    public double getLitros() {
        return litros;
    }


    public void setLitros(double litros) {
        this.litros = litros;
    }


    public void AbastecimentoModel(double precoPorLitro,double litro) {
        this.precoPorLitro = precoPorLitro;
        this.litros = litros;
    }
}
