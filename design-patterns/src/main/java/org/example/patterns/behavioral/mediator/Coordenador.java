package org.example.patterns.behavioral.mediator;

public class Coordenador implements Setor {

    public static Coordenador instance = new Coordenador();

    private Coordenador() {
    }

    public static Coordenador getInstance() {
        return instance;
    }

    public String receberAtendimento(String mensagem) {
        return "O setor recebeu seu atendimento e estará entrando em contato." + mensagem;
    }

    public String receberChamado(String mensagem) {
        return "O setor técnico recebeu seu chamado e está analisando sua requisição." + mensagem;
    }

    public String receberRetorno(String mensagem) {
        return "O setor analisou sua requisição e e retornou que o solicitação foi solucionada. Ficamos a disposição!" + mensagem;

    }
}