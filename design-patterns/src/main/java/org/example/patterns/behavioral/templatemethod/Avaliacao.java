package org.example.patterns.behavioral.templatemethod;

public abstract class Avaliacao {

    private int id;
    protected String nomeUsuario;
    private int nota;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getnomeUsuario() {
        return nomeUsuario;
    }

    public void setnomeUsuario(String nomeAvaliacao) {
        this.nomeUsuario = nomeAvaliacao;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public boolean validarAvaliacao() {
        return (this.nota >= 1 && this.nota <= 5);
    }

    public abstract String verificarAvaliacao();

    public String getTipo() {
        return "Avaliacao";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "id=" + this.id +
                ", nomeUsuario='" + this.nomeUsuario + '\'' +
                ", nota='" + this.nota + '\'' +
                ", resultado=" + this.verificarAvaliacao() +
                '}';
    }
}
