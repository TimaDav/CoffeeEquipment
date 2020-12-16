package com.max.idea;

class Cappuccino {
    private int water;
    private int milk;
    private int cofee;
    private int sugar;

    public Cappuccino(){
        water = 100;
        milk = 20;
        cofee = 10;
        sugar = 10;
    }

    public Cappuccino (int water, int milk, int cofee, int sugar) {
        this.water = water;
        this.milk = milk;
        this.cofee = cofee;
        this.sugar = sugar;
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
    public int getSugar() {
        return sugar;
    }
    public void setWater(int water){
        this.water = water;
    }
    public void setMilk( int milk){
        this.milk = milk;
    }
    public void setCofee( int cofee){
        this.cofee = cofee;
    }
    private void setSugar(int sugar){
        this.sugar = sugar;
    }
}

