package org.launchcode;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<MenuItems> newMenu = new ArrayList<>();

        //Construct some menu items

        MenuItems tomatoSoup = new MenuItems("Tomato Soup", 3.5, "A Creamy Tomato Soup", "Appetizer", true);
        MenuItems grilledCheese = new MenuItems("Grilled Cheese", 6.5, "Toasted Bread with Melted Cheese", "Entree", true);
        MenuItems brownie = new MenuItems("Brownie", 4.0, "A Tasty Dessert", "Dessert", true);

        //Construct the Menu

        Menu testMenu = new Menu(newMenu, true);

        //Add them to Menu

        testMenu.addItem(tomatoSoup);
        testMenu.addItem(grilledCheese);
        testMenu.addItem(brownie);

        //Call Method to print
        System.out.println(testMenu);
        //Call remove method here
    }
}
