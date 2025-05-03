package org.example.patterns.structural.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdministrativoTest {

    @Test
    void deveRetornarRelatorioAdministrativoPortugues() {
        Linguas linguas = new Portugues();
        Administrativo administrativo = new Administrativo("Administrativo");
        administrativo.setLinguas(linguas);

        assertEquals("Portugues", administrativo.relatorioInfo());
    }


    @Test
    void deveRetornarRelatorioFinanceiroIngles() {
        Linguas linguas = new Ingles();
        Administrativo administrativo = new Administrativo("Administrativo");
        administrativo.setLinguas(linguas);

        assertEquals("Ingles", administrativo.relatorioInfo());
    }


    @Test
    void deveRetornarRelatorioFinanceiroEspanhol() {
        Linguas linguas = new Espanhol();
        Administrativo administrativo = new Administrativo("Administrativo");
        administrativo.setLinguas(linguas);

        assertEquals("Espanhol", administrativo.relatorioInfo());
    }


}