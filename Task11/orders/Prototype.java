package org.example.orders;

import java.util.Arrays;

abstract class Prototype {
    protected int orderId;
    protected String orderAddress;
    protected String[] items;

    public Prototype(){}

    public Prototype(Prototype prototype) {
        this.orderAddress = prototype.orderAddress;
        this.items = prototype.items.clone();
        this.orderId = prototype.orderId;
    }

    public Prototype(int orderId, String orderAddress, String[] items) {
        this.orderId = orderId;
        this.orderAddress = orderAddress;
        this.items = items;
    }

    public abstract Prototype clone(String orderAddress);

    @Override
    public String toString() {
        return "Заказ " + orderId + " по адресу " + orderAddress + "\nТовары:" + Arrays.toString(items);
    }
}
