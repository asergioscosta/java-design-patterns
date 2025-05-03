package org.example.patterns.creational.abstractfactory;

public class Contratacao {

    private Entrevistas entrevistas;
    private Selecao selecao;

    public Contratacao(FabricaAbstrata fabrica) {
        this.entrevistas = fabrica.createEntrevistas();
        this.selecao = fabrica.createSelecao();
    }

    public String executarEntrevista() {
        return this.entrevistas.executar();
    }

    public String executarSelecao() {
        return this.selecao.executar();
    }
}
