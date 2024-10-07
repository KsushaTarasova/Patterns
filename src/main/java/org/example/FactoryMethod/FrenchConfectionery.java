package org.example.FactoryMethod;

public class FrenchConfectionery extends Confectionery{
    @Override
    public Dessert createDessert() {
        return new Croissant();
    }
}
