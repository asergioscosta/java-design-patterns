package org.example.patterns.behavioral.chainofresponsability;

public class StatusProdutoConferido implements StatusProduto {

    public static StatusProdutoConferido statusProdutoConferido = new StatusProdutoConferido();

    private StatusProdutoConferido() {
    }

    public static StatusProdutoConferido getstatusProdutoConferido() {
        return statusProdutoConferido;
    }
}
