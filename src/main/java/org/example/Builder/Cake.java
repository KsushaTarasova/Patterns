package org.example.Builder;

public class Cake {
    private String rough;
    private String cream;
    private String filling;

    public Cake(){
        super();
    }
    public String getRough() {
        return rough;
    }

    public void setRough(String rough) {
        this.rough = rough;
    }

    public String getCream() {
        return cream;
    }

    public void setCream(String cream) {
        this.cream = cream;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    @Override
    public String toString() {
        return "{" +
                "основа = " + rough +
                ", крем = " + cream +
                ", начинка = " + filling +
                '}';
    }
}
