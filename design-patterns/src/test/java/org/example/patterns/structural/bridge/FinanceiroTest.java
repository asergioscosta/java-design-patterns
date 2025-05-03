package org.example.patterns.structural.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FinanceiroTest {

    @Test
    void deveRetornarRelatorioFinanceiroPortugues() {
        Linguas linguas = new Portugues();
        Financeiro financeiro = new Financeiro("Financeiro");
        financeiro.setLinguas(linguas);

        assertEquals("Portugues", financeiro.relatorioInfo());
    }

    @Test
    void deveRetornarRelatorioFinanceiroIngles() {
        Linguas linguas = new Ingles();
        Financeiro financeiro = new Financeiro("Financeiro");
        financeiro.setLinguas(linguas);

        assertEquals("Ingles", financeiro.relatorioInfo());
    }

    @Test
    void deveRetornarRelatorioFinanceiroEspanhol() {
        Linguas linguas = new Espanhol();
        Financeiro financeiro = new Financeiro("Financeiro");
        financeiro.setLinguas(linguas);

        assertEquals("Espanhol", financeiro.relatorioInfo());
    }
}