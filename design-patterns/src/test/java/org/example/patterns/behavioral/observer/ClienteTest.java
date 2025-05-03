package org.example.patterns.behavioral.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveNotificarUmCliente() {
        Produto produto = new Produto("Camisa", "Camisa", 1);
        Cliente cliente = new Cliente("Cliente");
        cliente.comprar(produto);
        produto.lancarProduto();
        assertEquals("Cliente, compra de Produto{nomeProduto='Camisa', descricaoProduto='Camisa', quantidadeProduto=1}", cliente.getUltimaNotificacao());
    }

    @Test
    void deveNotificarClientes() {
        Produto produto = new Produto("Camisa", "Camisa", 1);
        Cliente cliente1 = new Cliente("Cliente 1");
        Cliente cliente2 = new Cliente("Cliente 2");
        cliente1.comprar(produto);
        cliente2.comprar(produto);
        produto.lancarProduto();
        assertEquals("Cliente 1, compra de Produto{nomeProduto='Camisa', descricaoProduto='Camisa', quantidadeProduto=1}", cliente1.getUltimaNotificacao());
        assertEquals("Cliente 2, compra de Produto{nomeProduto='Camisa', descricaoProduto='Camisa', quantidadeProduto=1}", cliente2.getUltimaNotificacao());
    }

    @Test
    void naodeveNotificarCliente() {
        Produto produto = new Produto("Camisa", "Camisa", 1);
        Cliente cliente = new Cliente("Cliente");
        produto.lancarProduto();
        assertEquals(null, cliente.getUltimaNotificacao());
    }

    @Test
    void deveNotificarClienteProduto1() {
        Produto produto1 = new Produto("Camisa", "Camisa", 1);
        Produto produto2 = new Produto("Camisa", "Camisa", 1);
        Cliente cliente1 = new Cliente("Cliente 1");
        Cliente cliente2 = new Cliente("Cliente 2");
        cliente1.comprar(produto1);
        cliente2.comprar(produto2);
        produto1.lancarProduto();
        assertEquals("Cliente 1, compra de Produto{nomeProduto='Camisa', descricaoProduto='Camisa', quantidadeProduto=1}", cliente1.getUltimaNotificacao());
        assertEquals(null, cliente2.getUltimaNotificacao());
    }
}