package org.example.patterns.creational.abstractfactory;

public class FabricaDesenvolvedor implements FabricaAbstrata {

    @Override
    public Entrevistas createEntrevistas() {
        return new EntrevistaDesenvolvedor();
    }

    @Override
    public Selecao createSelecao() {
        return new SelecaoDesenvolvedor();
    }
}
