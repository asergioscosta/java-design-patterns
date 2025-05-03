package org.example.patterns.behavioral.strategy;

public class Vendedor {

    private float percentualComissao;

    public float getPercentualComissao() {
        return percentualComissao;
    }

    public void comissaoRoupa(float quantidadeVendas, float valorComissao) {
        GerenciadorComissao gerenciadorComissao = new GerenciadorComissao(quantidadeVendas, valorComissao);
        this.percentualComissao = gerenciadorComissao.comissao(new ComissaoRoupa());
    }

    public void comissaoMovel(float quantidadeVendas, float valorComissao) {
        GerenciadorComissao gerenciadorComissao = new GerenciadorComissao(quantidadeVendas, valorComissao);
        this.percentualComissao = gerenciadorComissao.comissao(new ComissaoMovel());
    }

    public void comissaoEletronico(float quantidadeVendas, float valorComissao) {
        GerenciadorComissao gerenciadorComissao = new GerenciadorComissao(quantidadeVendas, valorComissao);
        this.percentualComissao = gerenciadorComissao.comissao(new ComissaoEletronico());
    }

    public void comissaoBrinquedo(float quantidadeVendas, float valorComissao) {
        GerenciadorComissao gerenciadorComissao = new GerenciadorComissao(quantidadeVendas, valorComissao);
        this.percentualComissao = gerenciadorComissao.comissao(new ComissaoBrinquedo());
    }

    public void comissaoAlimento(float quantidadeVendas, float valorComissao) {
        GerenciadorComissao gerenciadorComissao = new GerenciadorComissao(quantidadeVendas, valorComissao);
        this.percentualComissao = gerenciadorComissao.comissao(new ComissaoAlimento());
    }
}
