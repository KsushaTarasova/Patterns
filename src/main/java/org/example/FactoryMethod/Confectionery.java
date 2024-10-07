package org.example.FactoryMethod;

public abstract class Confectionery {
    public abstract Dessert createDessert();
    public void orderDessert(){
        Dessert dessert = createDessert();
        dessert.makeDessert();

        System.out.println("Вот ваш " + dessert.getDessertName() + ", приходите еще!");
    }
}
