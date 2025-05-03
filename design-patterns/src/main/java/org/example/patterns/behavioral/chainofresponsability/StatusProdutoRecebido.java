package org.example.patterns.behavioral.chainofresponsability;

public class StatusProdutoRecebido implements StatusProduto {

    public static StatusProdutoRecebido statusProdutoRecebido = new StatusProdutoRecebido();

    private StatusProdutoRecebido() {
    }

    public static StatusProdutoRecebido getStatusProdutoRecebido() {
        return statusProdutoRecebido;
    }
}
