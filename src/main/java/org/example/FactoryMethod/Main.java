package org.example.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        Confectionery frenchConfectionery = new FrenchConfectionery();
        Confectionery italianConfectionery = new ItalianConfectionery();
        frenchConfectionery.orderDessert();
        italianConfectionery.orderDessert();
    }
}
