package org.example.factory;

import org.example.models.Airship;
import org.example.models.Flyable;

public class AirshipFactory implements Factory{
    @Override
    public Flyable createFlyable() {
        return new Airship();
    }
}
