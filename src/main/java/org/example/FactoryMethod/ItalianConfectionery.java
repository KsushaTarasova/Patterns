package org.example.FactoryMethod;

public class ItalianConfectionery extends Confectionery{
    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }

}
