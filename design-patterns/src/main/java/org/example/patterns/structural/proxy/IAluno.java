package org.example.patterns.structural.proxy;

import java.util.List;

public interface IAluno {
    List<String> obterDadosPessoais();
    List<Float> obterNotas(Funcionario funcionario);
}