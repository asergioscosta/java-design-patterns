package org.example.patterns.behavioral.state;

public class Funcionario {

    private String nome;

    private FuncionarioEstado estado;

    public Funcionario() {
        this.estado = FuncionarioEstadoContratado.getInstance();
    }

    public void setEstado(FuncionarioEstado estado) {
        this.estado = estado;
    }

    public boolean afastar() {
        return estado.afastar(this);
    }

    public boolean aposentar() {
        return estado.aposentar(this);
    }

    public boolean contratar() {
        return estado.contratar(this);
    }

    public boolean desligar() {
        return estado.desligar(this);
    }

    public boolean efetivar() {
        return estado.efetivar(this);
    }

    public boolean experiencia() {
        return estado.experiencia(this);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public FuncionarioEstado getEstado() {
        return estado;
    }
}
