package com.example.domain;

import com.example.afactory.component.Bean;
import com.example.afactory.component.Water;

import java.io.Serializable;
import java.util.Objects;

public abstract class Coffee implements Cloneable, Serializable {

    protected final Bean bean;
    protected final Water water;
    protected final Brand brand;

    protected Coffee(Bean bean, Water water, Brand brand) {
        this.bean = bean;
        this.water = water;
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coffee)) return false;
        final Coffee coffee = (Coffee) o;
        return Objects.equals(bean, coffee.bean)
                && Objects.equals(water, coffee.water)
                && brand == coffee.brand;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bean, water, brand);
    }

    @Override
    public Coffee clone() {
        Coffee clone = null;
        try {
            clone = (Coffee) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
