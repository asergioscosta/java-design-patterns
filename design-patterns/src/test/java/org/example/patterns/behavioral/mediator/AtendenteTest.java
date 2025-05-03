package org.example.patterns.behavioral.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtendenteTest {

    @Test
    void deveReceberAtendimentoDepartamento() {
        Atendente atendente = new Atendente();
        assertEquals("Atendimento recebido pelo setor.\nO Departamento respondeu sua solicitação conforme mensagem a seguir.\n" +
                        ">>O setor recebeu seu atendimento e estará entrando em contato.Lentidão para realizar pagamento.",
                atendente.receberAtendimento("Lentidão para realizar pagamento."));
    }

    @Test
    void deveReceberChamadoDepartamento() {
        Atendente atendente = new Atendente();
        assertEquals("Chamado recebido pelo setor.\nO Departamento respondeu sua solicitação com a mensagem a seguir.\n" +
                        ">>O setor técnico recebeu seu chamado e está analisando sua requisição.Chamado em análise.",
                atendente.receberChamado("Chamado em análise."));
    }

    @Test
    void deveReceberRetornoDepartamento() {
        Atendente atendente = new Atendente();
        assertEquals("Retorno recebido pelo setor.\nO Departamento respondeu sua solicitação conforme mensagem a seguir.\n" +
                        ">>O setor analisou sua requisição e e retornou que o solicitação foi solucionada. Ficamos a disposição!Problema resolvido.",
                atendente.receberRetorno("Problema resolvido."));
    }
}