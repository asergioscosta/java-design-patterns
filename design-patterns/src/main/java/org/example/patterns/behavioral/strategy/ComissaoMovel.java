package org.example.patterns.behavioral.strategy;

public class ComissaoMovel implements Comissao {

    public float comissao(float quantidadeVendas, float valorComissao) {
        return quantidadeVendas * valorComissao;
    }
}