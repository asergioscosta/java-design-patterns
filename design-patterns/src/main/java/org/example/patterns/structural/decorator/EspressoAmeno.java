package org.example.patterns.structural.decorator;

public class EspressoAmeno extends CafeteriaDecorator {

    public EspressoAmeno(Cafeteria cafeteria) {
        super(cafeteria);
    }

    public float getCusto() {
        return 1.5f;
    }

}
