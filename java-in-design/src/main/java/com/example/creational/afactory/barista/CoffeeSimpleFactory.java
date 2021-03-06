package com.example.creational.afactory.barista;

import com.example.creational.afactory.component.Bean;
import com.example.creational.afactory.component.Milk;
import com.example.creational.afactory.component.Water;
import com.example.domain.*;

/**
 * Simple Factory
 */
public class CoffeeSimpleFactory {

    public static Coffee makeAmericano() {
        return new Americano.Builder(null, null).build();
    }

    public static Coffee makeHazelnut(Milk milk) {
        return new Hazelnut.Builder(new Bean(), Water.regular()).milk(milk).build();
    }

    public static Coffee makeEspresso() {
        return new Espresso.Builder(null, null).build();
    }

    public static Coffee makeMocha() {
        return new Mocha.Builder(null, null).milk(null).build();
    }
}
