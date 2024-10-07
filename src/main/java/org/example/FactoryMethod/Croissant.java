package org.example.FactoryMethod;

public class Croissant implements Dessert{
    @Override
    public void makeDessert() {
        System.out.println("Готовим круассан");
    }

    @Override
    public String getDessertName() {
        return "круассан";
    }
}
