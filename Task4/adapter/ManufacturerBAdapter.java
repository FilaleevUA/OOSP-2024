package org.example.adapter;

import org.example.objects.ManufacturerBSystem;
import org.example.objects.SmartHomeSystem;

public class ManufacturerBAdapter implements SmartHomeSystem {
    private ManufacturerBSystem system;

    public ManufacturerBAdapter(ManufacturerBSystem system) {
        this.system = system;
    }

    @Override
    public void turnOnLight() {
        system.enableLighting();
    }

    @Override
    public void turnOffLight() {
        system.disableLighting();
    }

    @Override
    public void setTemperature(int temperature) {
        system.setThermalSetting(temperature);
    }
}
