package org.launchcode;

import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("What are the number of miles you have driven?");
        Double miles = input.nextDouble();

        System.out.println("How many gallons of gas did you use?");
        Double gas = input.nextDouble();

        Double milesPerGallon = miles / gas;
        System.out.println("Your gas millage is " + milesPerGallon);
    }
}
