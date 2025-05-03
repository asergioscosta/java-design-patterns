package org.example.patterns.behavioral.strategy;

public class GerenciadorComissao {

    private float quantidadeVendas;
    private float valorComissao;

    public GerenciadorComissao(float quantidadeVendas, float valorComissao) {
        this.quantidadeVendas = quantidadeVendas;
        this.valorComissao = valorComissao;
    }

    public float comissao(Comissao comissao) {
        return comissao.comissao(quantidadeVendas, valorComissao);
    }
}
