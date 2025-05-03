package org.example.patterns.creational.singleton;

public class ValidadorNotificacao {

    private ValidadorNotificacao() {};

    private static ValidadorNotificacao instance = new ValidadorNotificacao();

    public static ValidadorNotificacao getInstance() {
        return instance;
    }

    private String nomeValidador;

    private String envioNotificacao;

    public String getNomeValidador() {
        return nomeValidador;
    }

    public void setNomeValidador(String nomeValidador) {
        this.nomeValidador = nomeValidador;
    }

    public String getEnvioNotificacao() {
        return envioNotificacao;
    }

    public void setEnvioNotificacao(String envioNotificacao) {
        this.envioNotificacao = envioNotificacao;
    }
}