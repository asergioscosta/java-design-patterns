package org.example.patterns.structural.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CafeteriaTest {

    @Test
    void deveRetornarValorCafe(){
        Cafeteria cafeteria = new CafeteriaPadrao(10.0f);

        assertEquals(10.0f, cafeteria.getCustoAdicional());
    }

    @Test
    void deveRetornarValorEspresso(){
        Cafeteria cafeteria = new Espresso(new CafeteriaPadrao(10.0f));

        assertEquals(12.0f, cafeteria.getCustoAdicional());
    }

    @Test
    void deveRetornarValorEspressoAmeno(){
        Cafeteria cafeteria = new EspressoAmeno(new CafeteriaPadrao(10.0f));

        assertEquals(11.5f, cafeteria.getCustoAdicional());
    }

    @Test
    void deveRetornarValorLatte(){
        Cafeteria cafeteria = new Latte(new CafeteriaPadrao(10.0f));

        assertEquals(11.5f, cafeteria.getCustoAdicional());
    }

    @Test
    void deveRetornarValorCappuccino(){
        Cafeteria cafeteria = new Cappuccino(new CafeteriaPadrao(10.0f));

        assertEquals(14.0f, cafeteria.getCustoAdicional());
    }

    @Test
    void deveRetornarValorTodosTiposCafe(){
        Cafeteria cafeteria = new Cappuccino(new Latte(new EspressoAmeno(new Espresso(new CafeteriaPadrao(10.0f)))));

        assertEquals(19.0f, cafeteria.getCustoAdicional());
    }
}