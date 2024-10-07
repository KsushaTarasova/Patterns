package org.example.Builder;

public class Main {
    public static void main(String[] args) {
        CakeBuilder caramelCakeBuilder = new CaramelCakeBuilder();
        Confectionary caramelConfectionary = new Confectionary(caramelCakeBuilder);
        Cake caramelCake = caramelConfectionary.makeCake();
        System.out.println(caramelCake);
        System.out.println("-----------------------");
        CakeBuilder fruitCakeBuilder = new FruitCakeBuilder();
        Confectionary fruitConfectionary = new Confectionary(fruitCakeBuilder);
        Cake fruitCake = fruitConfectionary.makeCake();
        System.out.println(fruitCake);
    }
}
