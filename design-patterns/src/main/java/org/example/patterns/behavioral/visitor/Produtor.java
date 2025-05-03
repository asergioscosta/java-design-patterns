package org.example.patterns.behavioral.visitor;

public class Produtor implements Pessoa {

    private int id;

    private String nomeProdutor;

    public Produtor(int id, String nomeProdutor) {
        this.id = id;
        this.nomeProdutor = nomeProdutor;
    }

    public String getNomeProdutor() {
        return nomeProdutor;
    }

    public void setNomeProdutor(String nomeProdutor) {
        this.nomeProdutor = nomeProdutor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirProdutor(this);
    }
}
