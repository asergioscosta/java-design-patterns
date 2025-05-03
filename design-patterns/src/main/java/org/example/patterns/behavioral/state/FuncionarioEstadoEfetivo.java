package org.example.patterns.behavioral.state;

public class FuncionarioEstadoEfetivo extends FuncionarioEstado {

    private FuncionarioEstadoEfetivo() {};

    private static FuncionarioEstadoEfetivo instance = new FuncionarioEstadoEfetivo();

    public static FuncionarioEstadoEfetivo getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Efetivo";
    }

    public boolean afastar(Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoAfastado.getInstance());
        return true;
    }

    public boolean aposentar(Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoAposentado.getInstance());
        return true;
    }

    public boolean desligar(Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoDesligado.getInstance());
        return true;
    }
}
