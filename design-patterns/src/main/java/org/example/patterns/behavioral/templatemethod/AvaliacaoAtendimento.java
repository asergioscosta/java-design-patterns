package org.example.patterns.behavioral.templatemethod;

public class AvaliacaoAtendimento extends Avaliacao {

    public String verificarAvaliacao() {
        if (this.getNota() <= 5) {
            return "Avaliação Realizada com Sucesso!";
        } else {
            return "Avaliação inválida.";
        }
    }
}
