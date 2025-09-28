package org.example;


public class Main {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart(new StandardShipping());
        cart.addItem(50.0);
        cart.addItem(20.0);
        System.out.printf("Total with Standard Shipping: R$%.2f%n", cart.calculateTotal());
        cart.setShippingStrategy(new ExpressShipping());
        System.out.printf("Total with Express Shipping: R$%.2f%n", cart.calculateTotal());
        cart.setShippingStrategy(new FreeShipping());
        System.out.printf("Total with Free Shipping: R$%.2f%n", cart.calculateTotal());
    }
}