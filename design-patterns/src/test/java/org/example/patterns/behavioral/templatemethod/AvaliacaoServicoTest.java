package org.example.patterns.behavioral.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AvaliacaoServicoTest {

    @Test
    void deveRetornarAvaliacaoRealizada() {
        AvaliacaoServico avaliacao = new AvaliacaoServico();
        avaliacao.setNota(5);
        assertEquals("Avaliação Realizada com Sucesso!", avaliacao.verificarAvaliacao());
    }

    @Test
    void deveRetornarAvaliacaoInvalida() {
        AvaliacaoServico avaliacao = new AvaliacaoServico();
        avaliacao.setNota(6);
        assertEquals("Avaliação inválida.", avaliacao.verificarAvaliacao());
    }

    @Test
    void deveRetornarInformacoes() {
        AvaliacaoServico avaliacao = new AvaliacaoServico();
        avaliacao.setId(1);
        avaliacao.setnomeUsuario("Augusto");
        avaliacao.setNota(5);
        assertEquals("AvaliacaoServico{id=1, nomeUsuario='Augusto', nota='5', resultado=Avaliação Realizada com Sucesso!}", avaliacao.getInfo());
    }
}