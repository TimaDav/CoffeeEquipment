package com.max.idea;

public class Main {

        public static void main (String [] arg ){
            CoffeeMachine boschCoffeeMachine = new CoffeeMachine("Black", "Bosch", 3000, 500, 300);
            boschCoffeeMachine.addWater(2000);
            boschCoffeeMachine.addMilk(500);
            boschCoffeeMachine.addCofee(150);
        }


    }

