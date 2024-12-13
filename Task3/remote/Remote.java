package org.example.remote;

import org.example.objects.VirtualMachine;

abstract class Remote {
    protected VirtualMachine virtualMachine;

    public Remote(VirtualMachine virtualMachine) {
        this.virtualMachine = virtualMachine;
    }

    public void turnOn(){
        virtualMachine.start();
    }

    public void turnOff(){
        virtualMachine.stop();
    }
}
