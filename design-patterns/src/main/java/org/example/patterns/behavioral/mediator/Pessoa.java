package org.example.patterns.behavioral.mediator;

public class Pessoa {
    public String receberAtendimento(String mensagem) {
        return Departamento.getInstance().receberAtendimento(mensagem);
    }

    public String receberChamado(String mensagem) {
        return Departamento.getInstance().receberChamado(mensagem);
    }

    public String receberRetorno(String mensagem) {
        return Departamento.getInstance().receberRetorno(mensagem);
    }
}
