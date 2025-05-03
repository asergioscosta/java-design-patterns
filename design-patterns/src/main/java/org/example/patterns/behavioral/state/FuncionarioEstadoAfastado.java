package org.example.patterns.behavioral.state;

public class FuncionarioEstadoAfastado extends FuncionarioEstado {

    private FuncionarioEstadoAfastado() {};

    private static FuncionarioEstadoAfastado instance = new FuncionarioEstadoAfastado();

    public static FuncionarioEstadoAfastado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Afastado";
    }

    public boolean desligar(Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoDesligado.getInstance());
        return true;
    }

    public boolean aposentar(Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoAposentado.getInstance());
        return true;
    }
}
