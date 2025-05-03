package org.example.patterns.behavioral.state;

public class FuncionarioEstadoDesligado extends FuncionarioEstado {

    private FuncionarioEstadoDesligado() {};

    private static FuncionarioEstadoDesligado instance = new FuncionarioEstadoDesligado();

    public static FuncionarioEstadoDesligado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Desligado";
    }
}
