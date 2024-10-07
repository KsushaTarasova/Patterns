package org.example.Builder;

public interface CakeBuilder {
    void reset();
    void makeCakeBase();
    void makeCream();
    void makeFilling();
    Cake getResult();
}
