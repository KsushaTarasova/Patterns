package org.example.Builder;

public class Confectionary {
    private CakeBuilder cakeBuilder;

    public Confectionary(CakeBuilder cakeBuilder) {
        this.cakeBuilder = cakeBuilder;
    }

    public Cake makeCake() {
        cakeBuilder.makeCakeBase();
        cakeBuilder.makeCream();
        cakeBuilder.makeFilling();
        return cakeBuilder.getResult();
    }
}
