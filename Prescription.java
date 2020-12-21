package com.max.idea;

public class Prescription {
    private int water;
    private int milk;
    private int cofee;

    public Prescription (int water, int milk, int cofee) {
        this.water = water;
        this.milk = milk;
        this.cofee = cofee;
    }

    private void Cappuccino (){
        final Prescription cappuccino = new Prescription( 100, 20, 10);
    }
    private void Americano (){
        final Prescription americano = new Prescription( 100, 0, 10);
    }
    private void Espresso (){
        final Prescription espressoo = new Prescription( 50, 0, 10);
    }
    private void Latte (){
        final Prescription latte = new Prescription( 100, 70, 15);
    }
}
