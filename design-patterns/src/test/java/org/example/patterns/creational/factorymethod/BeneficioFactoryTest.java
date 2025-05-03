package org.example.patterns.creational.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeneficioFactoryTest {

    @Test
    void deveRetornarExcecaoParaBeneficioInexistente(){
        try {
            IBeneficio beneficio = BeneficioFactory.obterBeneficio("Comissão");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Beneficio inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaBeneficioInvalido(){
        try {
            IBeneficio beneficio = BeneficioFactory.obterBeneficio("SeguroVida");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Beneficio inválido", e.getMessage());
        }
    }
}