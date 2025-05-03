package org.example.patterns.behavioral.strategy;

public class ComissaoRoupa implements Comissao {

    public float comissao(float quantidadeVendas, float valorComissao) {
        return quantidadeVendas * valorComissao;
    }
}
