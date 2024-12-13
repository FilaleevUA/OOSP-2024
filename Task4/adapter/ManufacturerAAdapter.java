package org.example.adapter;

import org.example.objects.ManufacturerASystem;
import org.example.objects.SmartHomeSystem;

public class ManufacturerAAdapter implements SmartHomeSystem {
    private ManufacturerASystem system;

    public ManufacturerAAdapter(ManufacturerASystem system) {
        this.system = system;
    }

    @Override
    public void turnOnLight() {
        system.activateLight();
    }

    @Override
    public void turnOffLight() {
        system.deactivateLight();
    }

    @Override
    public void setTemperature(int temperature) {
        system.adjustThermostat(temperature);
    }
}
