package org.example.patterns.behavioral.state;

public class FuncionarioEstadoExperiencia extends FuncionarioEstado {

    private FuncionarioEstadoExperiencia() {};

    private static FuncionarioEstadoExperiencia instance = new FuncionarioEstadoExperiencia();

    public static FuncionarioEstadoExperiencia getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Experiencia";
    }

    public boolean afastar(Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoAfastado.getInstance());
        return true;
    }

    public boolean desligar(Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoDesligado.getInstance());
        return true;
    }

    public boolean efetivar(Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoEfetivo.getInstance());
        return true;
    }
}
