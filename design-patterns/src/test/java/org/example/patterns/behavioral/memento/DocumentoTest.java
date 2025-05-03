package org.example.patterns.behavioral.memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DocumentoTest {

    @Test
    void deveRetornarArmazenarEstado() {
        Documento documento = new Documento();
        documento.setEstado(DocumentoEstadoRascunho.getInstance());
        documento.setEstado(DocumentoEstadoPublicado.getInstance());
        assertEquals(2, documento.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Documento documento = new Documento();
        documento.setEstado(DocumentoEstadoRascunho.getInstance());
        documento.setEstado(DocumentoEstadoPublicado.getInstance());
        documento.restauraEstado(0);
        assertEquals(DocumentoEstadoRascunho.getInstance(), documento.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Documento documento = new Documento();
        documento.setEstado(DocumentoEstadoRascunho.getInstance());
        documento.setEstado(DocumentoEstadoArquivado.getInstance());
        documento.setEstado(DocumentoEstadoRascunho.getInstance());
        documento.setEstado(DocumentoEstadoPublicado.getInstance());
        documento.restauraEstado(2);
        assertEquals(DocumentoEstadoRascunho.getInstance(), documento.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Documento documento = new Documento();
            documento.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Indice Inválido", e.getMessage());
        }
    }
}