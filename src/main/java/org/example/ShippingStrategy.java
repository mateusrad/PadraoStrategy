package org.example;

public interface ShippingStrategy {
    double calculateCost(double orderTotal);
}