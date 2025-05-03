package org.example.patterns.behavioral.visitor;

public class Comprador implements Pessoa {

    private int id;

    private String nomeComprador;

    private Produto produto;

    public Comprador(int id, String nomeComprador, Produto produto) {
        this.id = id;
        this.nomeComprador = nomeComprador;
        this.produto = produto;
    }

    public int getId() {
        return id;
    }

    public String getNomeComprador() {
        return nomeComprador;
    }

    public String getNomeProduto() {
        return this.produto.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirComprador(this);
    }
}
