package org.example.patterns.behavioral.state;

public class FuncionarioEstadoContratado extends FuncionarioEstado {

    private FuncionarioEstadoContratado() {};

    private static FuncionarioEstadoContratado instance = new FuncionarioEstadoContratado();

    public static FuncionarioEstadoContratado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Contratado";
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

    public boolean efetivar(Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoEfetivo.getInstance());
        return true;
    }

    public boolean experiencia(Funcionario funcionario) {
        funcionario.setEstado(FuncionarioEstadoExperiencia.getInstance());
        return true;
    }
}
