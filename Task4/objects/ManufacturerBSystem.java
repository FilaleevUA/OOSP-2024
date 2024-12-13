package org.example.objects;

public class ManufacturerBSystem {
    public void enableLighting() {
        System.out.println("Свет включён (Manufacturer B).");
    }

    public void disableLighting() {
        System.out.println("Свет выключен (Manufacturer B).");
    }

    public void setThermalSetting(int temp) {
        System.out.println("Температура установлена на " + temp + "°C (Manufacturer B).");
    }
}
