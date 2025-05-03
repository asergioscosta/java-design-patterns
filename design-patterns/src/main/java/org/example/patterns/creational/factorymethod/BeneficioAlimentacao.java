package org.example.patterns.creational.factorymethod;

public class BeneficioAlimentacao implements IBeneficio {

    public String aprovar() {
        return "Benefício Alimentação Aprovado";
    }

    public String depositar() {
        return "Benefício Alimentação Depositado";
    }
}
