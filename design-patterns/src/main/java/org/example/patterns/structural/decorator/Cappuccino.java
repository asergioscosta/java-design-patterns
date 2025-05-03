package org.example.patterns.structural.decorator;

public class Cappuccino extends CafeteriaDecorator {

    public Cappuccino(Cafeteria cafeteria) {
        super(cafeteria);
    }

    public float getCusto() {
        return 4.0f;
    }
}
