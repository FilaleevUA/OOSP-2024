package org.example.orders;

public class Order extends Prototype {

    public Order(int orderId, String orderAddress, String[] items) {
        this.orderId = orderId;
        this.orderAddress = orderAddress;
        this.items = items;
    }

    public Order(Order order) {
        super(order);
    }

    @Override
    public Order clone(String orderAddress) {
        return new Order(this.orderId, orderAddress, this.items);
    }
}
