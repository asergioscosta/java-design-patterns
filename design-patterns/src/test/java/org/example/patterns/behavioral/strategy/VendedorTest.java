package org.example.patterns.behavioral.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendedorTest {

    @Test
    void deveRetornarComissaoRoupa() {
        Vendedor vendedor = new Vendedor();
        vendedor.comissaoRoupa(20, 25);
        assertEquals(500.0f, vendedor.getPercentualComissao());
    }

    @Test
    void deveRetornarComissaoMovel() {
        Vendedor vendedor = new Vendedor();
        vendedor.comissaoMovel(10, 75);
        assertEquals(750.0f, vendedor.getPercentualComissao());
    }

    @Test
    void deveRetornarComissaoEletronico() {
        Vendedor vendedor = new Vendedor();
        vendedor.comissaoRoupa(10, 150);
        assertEquals(1500.0f, vendedor.getPercentualComissao());
    }

    @Test
    void deveRetornarComissaoBrinquedo() {
        Vendedor vendedor = new Vendedor();
        vendedor.comissaoRoupa(15, 15);
        assertEquals(225.0f, vendedor.getPercentualComissao());
    }

}