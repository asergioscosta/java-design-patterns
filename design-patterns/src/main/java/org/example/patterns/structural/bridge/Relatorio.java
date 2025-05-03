package org.example.patterns.structural.bridge;

public abstract class Relatorio {

    protected Linguas linguas;
    protected String relatorioSetor;

    public Relatorio(String relatorioSetor) {
        this.relatorioSetor = relatorioSetor;
    }

    public Linguas getLinguas() {
        return linguas;
    }

    public void setLinguas(Linguas linguas) {
        this.linguas = linguas;
    }

    public String getRelatorioSetor() {
        return relatorioSetor;
    }

    public void setRelatorioSetor(String relatorioSetor) {
        this.relatorioSetor = relatorioSetor;
    }

    public abstract String relatorioInfo();
}
