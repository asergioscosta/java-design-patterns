package org.example.patterns.behavioral.chainofresponsability;

public class FuncionarioConferente extends Funcionario {

    public FuncionarioConferente(Funcionario cargo) {
        statusProduto.add(StatusProdutoConferido.getstatusProdutoConferido());
        setCargoFuncionario(cargo);
    }

    public String getDescricaoCargo() {
        return "Conferente";
    }
}
