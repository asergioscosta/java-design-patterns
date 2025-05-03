package org.example.patterns.behavioral.chainofresponsability;

import java.util.ArrayList;

public abstract class Funcionario {

    protected ArrayList statusProduto = new ArrayList();

    private Funcionario cargoFuncionario;

    public Funcionario getCargoFuncionario() {
        return cargoFuncionario;
    }

    public void setCargoFuncionario(Funcionario cargoFuncionario) {
        this.cargoFuncionario = cargoFuncionario;
    }

    public abstract String getDescricaoCargo();

    public String entregarProduto(Produto produto) {
        if (statusProduto.contains(produto.getStatusProduto())) {
            return getDescricaoCargo();
        } else {
            if (cargoFuncionario != null) {
                return cargoFuncionario.entregarProduto(produto);
            } else {
                return "Sem produto para entregar";
            }
        }
    }
}


