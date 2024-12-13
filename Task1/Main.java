package org.example;

import org.example.toy.Toy;
import org.example.toy.ToyFactory;

public class Main {
    public static void main(String[] args) {
        ToyFactory factory = new ToyFactory();

        Toy constructor = factory.createToy("constructor");
        Toy ball = factory.createToy("ball");
        Toy doll = factory.createToy("doll");

        System.out.println(constructor.play());
        System.out.println(ball.play());
        System.out.println(doll.play());
    }
}