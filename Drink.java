package com.max.idea;

public class Drink {
    private int water;
    private int milk;
    private int cofee;

   public Drink (int water, int milk, int cofee) {
        this.water = water;
        this.milk = milk;
        this.cofee = cofee;
    }

    public  int getWater() {
        return water;
    }
    public int getMilk() {
        return  milk;
    }
    public int getCofee() {
        return cofee;
    }

}
