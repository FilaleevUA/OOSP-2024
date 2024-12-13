package org.example;

import org.example.objects.VMware;
import org.example.remote.RemoteControl;

public class Main {
    public static void main(String[] args) {
        VMware vmware = new VMware();
        RemoteControl remote = new RemoteControl(vmware);

        remote.turnOn();
        remote.turnOff();
    }
}