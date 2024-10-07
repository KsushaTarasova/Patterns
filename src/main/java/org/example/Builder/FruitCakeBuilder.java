package org.example.Builder;

public class FruitCakeBuilder implements CakeBuilder {
    private FruitCake fruitCake;

    public FruitCakeBuilder() {
        fruitCake = new FruitCake();
    }

    @Override
    public void reset() {
        fruitCake = new FruitCake();
    }

    @Override
    public void makeCakeBase() {
        System.out.println("Выпекаем бисвитную основу");
        this.fruitCake.setRough("бисквите");
    }

    @Override
    public void makeCream() {
        System.out.println("Готовим крем на сливках и творожном сыре");
        this.fruitCake.setCream("крем-чиз");
    }

    @Override
    public void makeFilling() {
        System.out.println("Добавляем фруктовую начинку");
        this.fruitCake.setFilling("фрукты");
    }

    @Override
    public FruitCake getResult() {
        if(fruitCake.getCream().isEmpty() || fruitCake.getRough().isEmpty() || fruitCake.getFilling().isEmpty()){
            System.out.println("Какой-то этап приготовления фруктового торта пропущен");
        }
        return this.fruitCake;
    }
}
