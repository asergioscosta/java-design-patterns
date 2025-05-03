package org.example.patterns.creational.factorymethod;

public class BeneficioTransporte implements IBeneficio {

    public String aprovar() {
        return "Benefício Transporte Aprovado";
    }

    public String depositar() {
        return "Benefício Transporte Depositado";
    }
}
