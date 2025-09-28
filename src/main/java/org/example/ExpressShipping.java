package org.example;

public class ExpressShipping implements ShippingStrategy {
    @Override
    public double calculateCost(double orderTotal) {
        return 25.0;
    }
}
