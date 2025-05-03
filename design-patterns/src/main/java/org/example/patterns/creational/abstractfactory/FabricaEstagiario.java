package org.example.patterns.creational.abstractfactory;

public class FabricaEstagiario implements FabricaAbstrata {

    @Override
    public Entrevistas createEntrevistas() {
        return new EntrevistaEstagiario();
    }

    @Override
    public Selecao createSelecao() {
        return new SelecaoEstagiario();
    }
}
