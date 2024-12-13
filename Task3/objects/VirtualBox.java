package org.example.objects;

public class VirtualBox implements VirtualMachine{

    @Override
    public void start() {
        System.out.println("Starting VirtualBox virtual machine...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping VirtualBox virtual machine...");
    }
}
