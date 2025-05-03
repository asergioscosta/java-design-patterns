package org.example.patterns.behavioral.strategy;

public class ComissaoAlimento implements Comissao {

    public float comissao(float quantidadeVendas, float valorComissao) {
        return quantidadeVendas * valorComissao;
    }
}
