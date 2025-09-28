package org.example;


public class StandardShipping implements ShippingStrategy {
    @Override
    public double calculateCost(double orderTotal) {
        return 10.0;
    }
}
