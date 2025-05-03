package org.example.patterns.behavioral.chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    FuncionarioConferente conferente;
    FuncionarioDespachante despachante;
    FuncionarioEntregador entregador;
    FuncionarioRecepcionista recepcionista;

    @BeforeEach
    void setUp() {
        despachante = new FuncionarioDespachante(null);
        recepcionista = new FuncionarioRecepcionista(conferente);
        conferente = new FuncionarioConferente(despachante);
        entregador = new FuncionarioEntregador(recepcionista);
    }

    @Test
    void deveRetornarStatusProdutoDespachado() {
        assertEquals("Despachante", despachante.entregarProduto(new Produto(StatusProdutoDespachado.getstatusProdutoDespachado())));
    }

    @Test
    void deveRetornarStatusProdutoRecebido() {
        assertEquals("Recepcionista", recepcionista.entregarProduto(new Produto(StatusProdutoRecebido.getStatusProdutoRecebido())));
    }

    @Test
    void deveRetornarStatusProdutoConferido() {
        assertEquals("Conferente", conferente.entregarProduto(new Produto(StatusProdutoConferido.getstatusProdutoConferido())));
    }

    @Test
    void deveRetornarStatusProdutoEntregue() {
        assertEquals("Entregador", entregador.entregarProduto(new Produto(StatusProdutoEntregue.getstatusProdutoEntregue())));
    }

    @Test
    void deveRetornarSemStatusProduto() {
        assertEquals("Sem produto para entregar", despachante.entregarProduto(new Produto(StatusProdutoEntregue.getstatusProdutoEntregue())));
    }


}