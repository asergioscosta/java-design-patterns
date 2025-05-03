package org.example.patterns.creational.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class BeneficioTransporteTest {

    @Test
    void deveRetornarAprovarBeneficioTransporte(){
        IBeneficio beneficio = BeneficioFactory.obterBeneficio("Transporte");
        assertEquals("Benefício Transporte Aprovado", beneficio.aprovar());
    }

    @Test
    void deveRetornarDepositarDepositoBeneficio(){
        IBeneficio beneficio = BeneficioFactory.obterBeneficio("Transporte");
        assertEquals("Benefício Transporte Depositado", beneficio.depositar());
    }
  
}