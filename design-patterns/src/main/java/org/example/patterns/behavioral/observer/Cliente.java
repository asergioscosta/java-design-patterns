package org.example.patterns.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class Cliente implements Observer {

    private String nome;
    private String ultimaNotificacao;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void comprar(Produto produto) {
        produto.addObserver(this);
    }

    @Override
    public void update(Observable produto, Object arg1) {
        this.ultimaNotificacao = this.nome + ", compra de " + produto.toString();
    }
}
