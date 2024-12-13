package org.example;

import org.example.orders.Order;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(1, "Москва", new String[]{"Молоко", "Хлеб"});
        Order orderClone = order.clone("Лондон");
        System.out.println(order);
        System.out.println(orderClone);
    }
}