package org.example.objects;

public class ManufacturerASystem {
    public void activateLight() {
        System.out.println("Свет включён (Manufacturer A).");
    }

    public void deactivateLight() {
        System.out.println("Свет выключен (Manufacturer A).");
    }

    public void adjustThermostat(int temperature) {
        System.out.println("Температура установлена на " + temperature + "°C (Manufacturer A).");
    }
}
