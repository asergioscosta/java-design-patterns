package org.example.patterns.creational.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class BeneficioPlanoSaudeTest {

    @Test
    void deveRetornarAprovarBeneficioPlanoSaude(){
        IBeneficio beneficio = BeneficioFactory.obterBeneficio("PlanoSaude");
        assertEquals("Benefício Plano de Saúde Aprovado", beneficio.aprovar());
    }

    @Test
    void deveRetornarDepositarBeneficioPlanoSaude(){
        IBeneficio beneficio = BeneficioFactory.obterBeneficio("PlanoSaude");
        assertEquals("Benefício Plano de Saúde Depositado", beneficio.depositar());
    }
  
}