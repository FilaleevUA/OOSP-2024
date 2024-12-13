package org.example;

import org.example.adapter.ManufacturerAAdapter;
import org.example.adapter.ManufacturerBAdapter;
import org.example.objects.ManufacturerASystem;
import org.example.objects.ManufacturerBSystem;
import org.example.objects.SmartHomeSystem;

public class Main {
    public static void main(String[] args) {
        ManufacturerASystem manufacturerASystem = new ManufacturerASystem();
        ManufacturerBSystem manufacturerBSystem = new ManufacturerBSystem();

        SmartHomeSystem smartHomeA = new ManufacturerAAdapter(manufacturerASystem);
        SmartHomeSystem smartHomeB = new ManufacturerBAdapter(manufacturerBSystem);

        System.out.println("=== Управление системой от Manufacturer A ===");
        smartHomeA.turnOnLight();
        smartHomeA.setTemperature(22);
        smartHomeA.turnOffLight();

        System.out.println("\n=== Управление системой от Manufacturer B ===");
        smartHomeB.turnOnLight();
        smartHomeB.setTemperature(25);
        smartHomeB.turnOffLight();
    }
}