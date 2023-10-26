package Seminar01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // BottleOfWater b1 = new BottleOfWater("1", 1, 1);
        // BottleOfWater b2 = new BottleOfWater("2", 2, 2);
        // BottleOfWater b3 = new BottleOfWater("5", 4, 3);
        // BottleOfWater b4 = new BottleOfWater("15", 123, 1);
        // BottleOfWater b5 = new BottleOfWater("20", 6, 5);
        HotDrink h1 = new HotDrink("11", 1, 1.5, 50);
        HotDrink h2 = new HotDrink("22", 2, 1.5, 60);
        HotDrink h3 = new HotDrink("33", 3, 1.5, 70);
        HotDrink h4 = new HotDrink("44", 4, 1.5, 80);
        HotDrink h5 = new HotDrink("55", 5, 1.5, 90);

        
        // BottleOfWaterVendingMachine vendingMachine = new BottleOfWaterVendingMachine(new ArrayList<>());
        // vendingMachine.addBottleOfWater(b1);
        // vendingMachine.addBottleOfWater(b2);
        // vendingMachine.addBottleOfWater(b3);
        // vendingMachine.addBottleOfWater(b4);
        // vendingMachine.addBottleOfWater(b5);

        HotDrinkVendingMachine hotVendingMachine = new HotDrinkVendingMachine(new ArrayList<>());
        hotVendingMachine.addHotDrink(h1);
        hotVendingMachine.addHotDrink(h2);
        hotVendingMachine.addHotDrink(h3);
        hotVendingMachine.addHotDrink(h4);
        hotVendingMachine.addHotDrink(h5);
        
        
        // System.out.println(vendingMachine.getProduct("20", 5));
        // System.out.println(vendingMachine.getProduct("20", 100));


        System.out.println();
        System.out.println(hotVendingMachine.getProduct("11", 1.5));//y
        System.out.println(hotVendingMachine.getProduct("77", 2.5));//n
        System.out.println(hotVendingMachine.getProduct("11", 1.5,50));//y
        System.out.println(hotVendingMachine.getProduct("11", 1.5,40));//n
        System.out.println(hotVendingMachine.getProduct("44",1.5,80));//y
        System.out.println(hotVendingMachine.getProduct(80));//y
        

        System.out.println();
        System.out.println("Общий список");
        for (HotDrink b : hotVendingMachine.getHotDrinks()) {
        System.out.println(b);
        }
    }
};