package org.example.patterns.behavioral.state;

public abstract class FuncionarioEstado {

    public abstract String getEstado();

    public boolean afastar(Funcionario funcionario) {
        return false;
    }

    public boolean aposentar(Funcionario funcionario) {
        return false;
    }

    public boolean contratar(Funcionario funcionario) {
        return false;
    }

    public boolean desligar(Funcionario funcionario) {
        return false;
    }

    public boolean efetivar(Funcionario funcionario) {
        return false;
    }

    public boolean experiencia(Funcionario funcionario) {
        return false;
    }
}
