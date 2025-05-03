package org.example.patterns.creational.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContratacaoTest {

    @Test
    void deveRetornarEntrevistaDesenvolvedor() {
        FabricaAbstrata fabrica = new FabricaDesenvolvedor();
        Contratacao contratacao = new Contratacao(fabrica);
        assertEquals("Executar agendamento de Entrevista com Desenvolvedor", contratacao.executarEntrevista());
    }

    @Test
    void deveRetornarEntrevistaEstagiario() {
        FabricaAbstrata fabrica = new FabricaEstagiario();
        Contratacao contratacao = new Contratacao(fabrica);
        assertEquals("Executar agendamento de entrevista com Estagiário.", contratacao.executarEntrevista());
    }

    @Test
    void deveRetornarSelecaoDesenvolvedor() {
        FabricaAbstrata fabrica = new FabricaDesenvolvedor();
        Contratacao contratacao = new Contratacao(fabrica);
        assertEquals("Executar seleção para Desenvolvedor", contratacao.executarSelecao());
    }

    @Test
    void deveRetornarSelecaoEstagiario() {
        FabricaAbstrata fabrica = new FabricaEstagiario();
        Contratacao contratacao = new Contratacao(fabrica);
        assertEquals("Executar seleção para Estagiário", contratacao.executarSelecao());
    }
}