package org.example.patterns.behavioral.visitor;

public class Vendedor implements Pessoa {

    private int id;

    private String nomeVendedor;

    private float comissaoVendedor;

    public Vendedor(int id, String nomeVendedor, float comissaoVendedor) {
        this.id = id;
        this.nomeVendedor = nomeVendedor;
        this.comissaoVendedor = comissaoVendedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public float getComissaoVendedor() {
        return comissaoVendedor;
    }

    public void setComissaoVendedor(float comissaoVendedor) {
        this.comissaoVendedor = comissaoVendedor;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirVendedor(this);
    }
}
