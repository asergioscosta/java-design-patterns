package org.example.patterns.behavioral.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AvaliacaoAtendimentoTest {

    @Test
    void deveRetornarAvaliacaoRealizada() {
        AvaliacaoAtendimento avaliacao = new AvaliacaoAtendimento();
        avaliacao.setNota(5);
        assertEquals("Avaliação Realizada com Sucesso!", avaliacao.verificarAvaliacao());
    }

    @Test
    void deveRetornarAvaliacaoInvalida() {
        AvaliacaoAtendimento avaliacao = new AvaliacaoAtendimento();
        avaliacao.setNota(6);
        assertEquals("Avaliação inválida.", avaliacao.verificarAvaliacao());
    }

    @Test
    void deveRetornarInformacoes() {
        AvaliacaoAtendimento avaliacao = new AvaliacaoAtendimento();
        avaliacao.setId(1);
        avaliacao.setnomeUsuario("Augusto");
        avaliacao.setNota(5);
        assertEquals("Avaliacao{id=1, nomeUsuario='Augusto', nota='5', resultado=Avaliação Realizada com Sucesso!}", avaliacao.getInfo());
    }
}