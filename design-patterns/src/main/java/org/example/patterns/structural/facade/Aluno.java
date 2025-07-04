package org.example.patterns.structural.facade;

public class Aluno {
    public boolean formar() {
        return AlunoFacade.verificarPendenciasFormatura(this);
    }
}