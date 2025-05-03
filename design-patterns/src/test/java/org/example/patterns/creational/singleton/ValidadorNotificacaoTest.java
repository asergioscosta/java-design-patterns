package org.example.patterns.creational.singleton;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidadorNotificacaoTest {

    @Test
    public void deveRetornarNomeValidador() {
        ValidadorNotificacao.getInstance().setNomeValidador("Horário de Ponto");

        assertEquals("Horário de Ponto", ValidadorNotificacao.getInstance().getNomeValidador());
    }

    @Test
    public void deveRetornarEnvioNotificacao() {
        ValidadorNotificacao.getInstance().setEnvioNotificacao("Ponto Registrado");

        assertEquals("Ponto Registrado", ValidadorNotificacao.getInstance().getEnvioNotificacao());
    }
}