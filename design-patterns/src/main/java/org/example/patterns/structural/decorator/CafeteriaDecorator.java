package org.example.patterns.structural.decorator;

public abstract class CafeteriaDecorator implements Cafeteria {

    private Cafeteria cafeteria;

    public CafeteriaDecorator(Cafeteria cafeteria) {
        this.cafeteria = cafeteria;
    }

    public Cafeteria getCafeteria() {
        return cafeteria;
    }

    public void setCafeteria(Cafeteria cafeteria) {
        this.cafeteria = cafeteria;
    }

    public abstract float getCusto();

    public float getCustoAdicional() {
        return this.cafeteria.getCustoAdicional() + (this.getCusto());
    }
}
