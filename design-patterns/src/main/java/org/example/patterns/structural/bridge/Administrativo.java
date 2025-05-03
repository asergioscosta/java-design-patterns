package org.example.patterns.structural.bridge;

public class Administrativo extends Relatorio {

    public Administrativo(String relatorioSetor) {
        super(relatorioSetor);
    }

    public String relatorioInfo() {
        return this.linguas.relatorioLinguas();
    }
}
