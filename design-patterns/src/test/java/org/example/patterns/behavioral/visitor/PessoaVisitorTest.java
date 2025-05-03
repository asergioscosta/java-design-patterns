package org.example.patterns.behavioral.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaVisitorTest {

    @Test
    void deveRetornarExibirComprador() {
        Comprador comprador = new Comprador(1, "Augusto", new Produto("Arroz"));
        PessoaVisitor visitor = new PessoaVisitor();

        assertEquals("Comprador{id=1, nomeComprador='Augusto', nome=Arroz}", visitor.exibir(comprador));
    }

    @Test
    void deveRetornarExibirProdutor() {
        Produtor produtor = new Produtor(1, "Augusto");
        PessoaVisitor visitor = new PessoaVisitor();

        assertEquals("Produtor{id=1, nomeProdutor='Augusto'}", visitor.exibir(produtor));
    }

    @Test
    void deveRetornarExibirVendedor() {
        Vendedor vendedor = new Vendedor(1, "Augusto", 987.65f);
        PessoaVisitor visitor = new PessoaVisitor();

        assertEquals("Vendedor{id=1, nomeVendedor='Augusto', comissaoVendedor=987.65}", visitor.exibir(vendedor));
    }
}