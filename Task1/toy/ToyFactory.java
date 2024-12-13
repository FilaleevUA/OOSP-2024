package org.example.toy;

import org.example.objects.Ball;
import org.example.objects.Constructor;
import org.example.objects.Doll;

public class ToyFactory{
    public Toy createToy(String type) {
        if (type.equalsIgnoreCase("ball")) {
            return new Ball();
        } else if (type.equalsIgnoreCase("doll")) {
            return new Doll();
        } else if (type.equalsIgnoreCase("constructor")) {
            return new Constructor();
        } else {
            throw new IllegalArgumentException("Invalid toy type: " + type);
        }
    }
}
