package com.max.idea;

class CoffeeMachine extends CoffeeEquipment {
        final private int maxWater;
        final private int maxMilk;
        final private int maxCofee;
        private int water;
        private int milk;
        private int cofee;

        public CoffeeMachine(String color, String name, int maxWater, int maxMilk, int maxCofee) {
            super(color, name);
            this.maxWater = maxWater;
            this.maxMilk = maxMilk;
            this.maxCofee = maxCofee;

        }

        public void addWater(int water) {
            int x = this.water+water;
            int y = getMaxWater()-this.water;
            if(x >= getMaxWater()) {
                this.water = y +  this.water;
                System.out.println(x-getMaxWater() + " "+"это не помещается в бак");
            }
            else {
                this.water = this.water + water;
            }
        }
        public void addMilk(int milk) {
            int x = this.milk+milk;
            int y = getMaxMilk()-this.milk;
            if (x >= getMaxMilk()) {
                this.milk = y +  this.milk;
                System.out.println(x-getMaxMilk() + " "+"это не помещается в бак");
            }
            else {
                this.milk = this.milk + milk;
            }
        }
        public void addCofee(int cofee) {
            int x = this.cofee+cofee;
            int y = getMaxCofee()-this.cofee;
            if (x >= getMaxCofee()) {
                this.cofee = y +  this.cofee;
                System.out.println(x-getMaxCofee() + " "+"это не помещается в бак");
            }
            else {
                this.cofee = this.cofee + cofee;
            }
        }
        public int getMaxWater() {
            return maxWater;
        }
        public int getMaxMilk() {
            return maxMilk;
        }
        public int getMaxCofee() {
            return maxCofee;
        }
        public int getWater() {
            return water;
        }
        public int getMilk() {
            return milk;
        }
        public int getCofee() {
            return cofee;
        }


        private void BoschCoffeeMachine() {
            CoffeeMachine boschCoffeeMachine = new CoffeeMachine("Black", "Bosch", 3000, 500, 300);
            boschCoffeeMachine.addWater(2000);
            boschCoffeeMachine.addMilk(500);
            boschCoffeeMachine.addCofee(150);
//            boschCoffeeMachine.makeDrink();
        }

        private void PhilipsCoffeeMachine(){
            CoffeeMachine philipsCoffeeMachine = new CoffeeMachine("Silver","Philips",1000,300,200);
            philipsCoffeeMachine.addWater(1000);
            philipsCoffeeMachine.addMilk(200);
            philipsCoffeeMachine.addCofee(150);
//            philipsCoffeeMachine.makeDrink();
        }
    }

