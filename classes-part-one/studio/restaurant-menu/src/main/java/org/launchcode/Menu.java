package org.launchcode;

import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItems> menu;

    private boolean isNew;

    //Constructor for Menu (menu, isNew)

    public Menu(ArrayList<MenuItems> menu, boolean isNew) {
        this.menu = menu;
        this.isNew = isNew;
    }

    //Add/Remove Method

    public void addItem (MenuItems menuItem) {
        menu.add(menuItem);
    }

    //Menu Last Updated Method

    //toString Method

    @Override
    public String toString() {
        return "Menu{" +
                "menu=" + menu +
                ", isNew=" + isNew +
                '}';
    }


    //Method for print whole or single items from the menu



    //Getters and Setters

    public ArrayList<MenuItems> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<MenuItems> menu) {
        this.menu = menu;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}
