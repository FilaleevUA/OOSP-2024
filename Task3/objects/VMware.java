package org.example.objects;

public class VMware implements VirtualMachine{

    @Override
    public void start() {
        System.out.println("Starting VMware virtual machine...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping VMware virtual machine...");
    }
}
