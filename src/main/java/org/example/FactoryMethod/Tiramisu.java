package org.example.FactoryMethod;

public class Tiramisu implements Dessert{
    @Override
    public void makeDessert() {
        System.out.println("Готовим тирамису");
    }

    @Override
    public String getDessertName() {
        return "тирамису";
    }
}
