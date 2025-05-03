package org.example.patterns.behavioral.memento;

public class DocumentoEstadoRevisado implements DocumentoEstado {

    private DocumentoEstadoRevisado() {
    }

    private static DocumentoEstadoRevisado instance = new DocumentoEstadoRevisado();

    public static DocumentoEstadoRevisado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Documento Revisado";
    }
}
