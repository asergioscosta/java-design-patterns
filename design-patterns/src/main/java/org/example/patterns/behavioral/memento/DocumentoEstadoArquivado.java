package org.example.patterns.behavioral.memento;

public class DocumentoEstadoArquivado implements DocumentoEstado {

    private DocumentoEstadoArquivado() {
    }

    private static DocumentoEstadoArquivado instance = new DocumentoEstadoArquivado();

    public static DocumentoEstadoArquivado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Documento Arquivado";
    }
}
