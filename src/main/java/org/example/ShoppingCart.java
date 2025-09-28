package org.example;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Double> items;
    private ShippingStrategy shippingStrategy;

    public ShoppingCart(ShippingStrategy shippingStrategy) {
        this.items = new ArrayList<>();
        this.shippingStrategy = shippingStrategy;
    }

    public void setShippingStrategy(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public void addItem(double price) {
        this.items.add(price);
    }

    public double calculateTotal() {
        double orderTotal = items.stream().mapToDouble(Double::doubleValue).sum();
        double shippingCost = shippingStrategy.calculateCost(orderTotal);
        return orderTotal + shippingCost;
    }
}