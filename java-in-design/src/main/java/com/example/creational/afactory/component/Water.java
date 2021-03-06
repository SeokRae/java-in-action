package com.example.creational.afactory.component;


import java.io.Serializable;
import java.util.Objects;

public class Water implements Serializable {
    private final int size;

    private Water() {
        this(0);
    }

    public Water(int size) {
        this.size = size;
    }

    public static Water none() {
        return new Water(0);
    }

    public static Water small() {
        return new Water(50);
    }

    public static Water regular() {
        return new Water(100);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Water)) return false;
        final Water water = (Water) o;
        return size == water.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size);
    }

    @Override
    public String toString() {
        return String.valueOf(size);
    }

    @Override
    public Water clone() {
        Water clone = null;
        try {
            clone = (Water) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
