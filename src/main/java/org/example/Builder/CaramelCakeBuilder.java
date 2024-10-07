package org.example.Builder;

public class CaramelCakeBuilder implements CakeBuilder {
    private CaramelCake caramelCake;

    public CaramelCakeBuilder(){
        caramelCake = new CaramelCake();
    }
    @Override
    public void reset() {
        caramelCake = new CaramelCake();
    }

    @Override
    public void makeCakeBase() {
        System.out.println("Выпекаем песочную основу");
        this.caramelCake.setRough("песочное тесто");
    }

    @Override
    public void makeCream() {
        System.out.println("Готовим заварной крем");
        this.caramelCake.setCream("заварной крем");
    }

    @Override
    public void makeFilling() {
        System.out.println("Добавляем карамельну начинку");
        this.caramelCake.setFilling("карамель");
    }

    @Override
    public CaramelCake getResult() {
        if (caramelCake.getCream().isEmpty() || caramelCake.getRough().isEmpty() || caramelCake.getFilling().isEmpty()) {
            System.out.println("Какой-то этап приготовления карамельного торта пропущен");
        }
        return this.caramelCake;
    }
}
