package org.example.patterns.behavioral.chainofresponsability;

public class FuncionarioEntregador extends Funcionario {

    public FuncionarioEntregador(Funcionario cargo) {
        statusProduto.add(StatusProdutoEntregue.getstatusProdutoEntregue());
        setCargoFuncionario(cargo);
    }

    public String getDescricaoCargo() {
        return "Entregador";
    }
}
