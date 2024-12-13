package org.example.factory;

import org.example.models.Flyable;
import org.example.models.Helicopter;

public class HelicopterFactory implements Factory{
    @Override
    public Flyable createFlyable() {
        return new Helicopter();
    }
}
