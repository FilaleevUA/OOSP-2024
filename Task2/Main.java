package org.example;

import org.example.factory.Factory;
import org.example.factory.PlaneFactory;
import org.example.models.Flyable;

public class Main {
    public static void main(String[] args) {
        Factory factory = new PlaneFactory();
        Flyable plane = factory.createFlyable();
        System.out.println(plane.fly());
    }
}