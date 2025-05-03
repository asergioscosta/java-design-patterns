package org.example.patterns.behavioral.observer;

import java.util.Observable;

public class Produto extends Observable {

    private String nomeProduto;
    private String descricaoProduto;
    private Integer quantidadeProduto;

    Produto(String nomeProduto, String descricaoProduto, Integer quantidadeProduto) {
        this.nomeProduto = nomeProduto;
        this.descricaoProduto = descricaoProduto;
        this.quantidadeProduto = quantidadeProduto;
    }

    public void lancarProduto() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return String.format("Produto{nomeProduto='%s', descricaoProduto='%s', quantidadeProduto=%d}",
                nomeProduto, descricaoProduto, quantidadeProduto);
    }
}
