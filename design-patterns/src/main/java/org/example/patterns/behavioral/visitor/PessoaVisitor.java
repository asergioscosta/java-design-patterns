package org.example.patterns.behavioral.visitor;

public class PessoaVisitor implements Visitor {

    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirComprador(Comprador comprador) {
        return "Comprador{" +
                "id=" + comprador.getId() +
                ", nomeComprador='" + comprador.getNomeComprador() + '\'' +
                ", nome=" + comprador.getNomeProduto() +
                '}';
    }

    @Override
    public String exibirProdutor(Produtor produtor) {
        return "Produtor{" +
                "id=" + produtor.getId() +
                ", nomeProdutor='" + produtor.getNomeProdutor() + '\'' +
                '}';
    }

    @Override
    public String exibirVendedor(Vendedor vendedor) {
        return "Vendedor{" +
                "id=" + vendedor.getId() +
                ", nomeVendedor='" + vendedor.getNomeVendedor() + '\'' +
                ", comissaoVendedor=" + vendedor.getComissaoVendedor() +
                '}';
    }
}