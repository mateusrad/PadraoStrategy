package org.example;

public class FreeShipping implements ShippingStrategy {
    @Override
    public double calculateCost(double orderTotal) {
        return 0.0;
    }
}
