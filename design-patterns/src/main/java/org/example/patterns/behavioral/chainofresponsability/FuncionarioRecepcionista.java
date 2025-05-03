package org.example.patterns.behavioral.chainofresponsability;

public class FuncionarioRecepcionista extends Funcionario {

    public FuncionarioRecepcionista(Funcionario cargo) {
        statusProduto.add(StatusProdutoRecebido.getStatusProdutoRecebido());
        setCargoFuncionario(cargo);
    }

    public String getDescricaoCargo() {
        return "Recepcionista";
    }
}
