package org.example.factory;

import org.example.models.Flyable;
import org.example.models.Plane;

public class PlaneFactory implements Factory{
    @Override
    public Flyable createFlyable() {
        return new Plane();
    }
}
