package org.example.patterns.structural.bridge;

public class Vendas extends Relatorio {

    public Vendas(String relatorioSetor) {
        super(relatorioSetor);
    }

    public String relatorioInfo() {
        return this.linguas.relatorioLinguas();
    }
}

