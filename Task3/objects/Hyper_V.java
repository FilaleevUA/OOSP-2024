package org.example.objects;

public class Hyper_V implements VirtualMachine{
    @Override
    public void start() {
        System.out.println("Starting Hyper-V virtual machine...");
    }
    @Override
    public void stop() {
        System.out.println("Stopping Hyper-V virtual machine...");
    }
}
