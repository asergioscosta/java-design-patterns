package org.example.patterns.structural.decorator;

public class CafeteriaPadrao implements Cafeteria {

    public float custoAdicional;

    public CafeteriaPadrao() {
    }

    public CafeteriaPadrao(float custoAdicional) {
        this.custoAdicional = custoAdicional;
    }

    @Override
    public float getCusto() {
        return 0;
    }

    public float getCustoAdicional() {
        return custoAdicional;
    }

    public void setCustoAdicional(float custoAdicional) {
        this.custoAdicional = custoAdicional;
    }
}
