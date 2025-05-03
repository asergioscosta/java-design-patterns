package org.example.patterns.structural.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendasTest {

    @Test
    void deveRetornarRelatorioVendasPortugues() {
        Linguas linguas = new Portugues();
        Vendas vendas = new Vendas("Vendas");
        vendas.setLinguas(linguas);

        assertEquals("Portugues", vendas.relatorioInfo());
    }

    @Test
    void deveRetornarRelatorioVendasIngles() {
        Linguas linguas = new Ingles();
        Vendas vendas = new Vendas("Vendas");
        vendas.setLinguas(linguas);

        assertEquals("Ingles", vendas.relatorioInfo());
    }

    @Test
    void deveRetornarRelatorioVendasEspanhol() {
        Linguas linguas = new Espanhol();
        Vendas vendas = new Vendas("Vendas");
        vendas.setLinguas(linguas);

        assertEquals("Espanhol", vendas.relatorioInfo());
    }

}