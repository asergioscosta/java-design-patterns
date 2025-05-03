package org.example.patterns.behavioral.chainofresponsability;

public class StatusProdutoDespachado implements StatusProduto {

    public static StatusProdutoDespachado statusProdutoDespachado = new StatusProdutoDespachado();

    private StatusProdutoDespachado() {
    }

    public static StatusProdutoDespachado getstatusProdutoDespachado() {
        return statusProdutoDespachado;
    }
}
