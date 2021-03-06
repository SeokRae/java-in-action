package com.example.creational.prototype.dev;

public class EnumDevFactory {

    public static BaseDeveloper create(DevType type) {
        return DevType.create(type).create();
    }

}
