package org.example.patterns.behavioral.mediator;

public class Departamento {

    private static Departamento instance = new Departamento();

    private Departamento() {
    }

    public static Departamento getInstance() {
        return instance;
    }

    public String receberAtendimento(String mensagem) {
        return "Atendimento recebido pelo setor.\n" +
                "O Departamento respondeu sua solicitação conforme mensagem a seguir.\n" +
                ">>" + Coordenador.getInstance().receberAtendimento(mensagem);
    }

    public String receberChamado(String mensagem) {
        return "Chamado recebido pelo setor.\n" +
                "O Departamento respondeu sua solicitação com a mensagem a seguir.\n" +
                ">>" + Coordenador.getInstance().receberChamado(mensagem);
    }

    public String receberRetorno(String mensagem) {
        return "Retorno recebido pelo setor.\n" +
                "O Departamento respondeu sua solicitação conforme mensagem a seguir.\n" +
                ">>" + Coordenador.getInstance().receberRetorno(mensagem);

    }
}
