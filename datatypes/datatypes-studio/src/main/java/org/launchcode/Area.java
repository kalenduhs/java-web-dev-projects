package org.launchcode;

import java.util.Scanner;
public class Area {


    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius:");

        double radius = input.nextDouble();
        double area = Circle.getArea(radius);
        /*if (radius < 0) {
            System.out.println("You entered a negative value for the radius, please don't do that");
        } else {
            System.out.println("The area of a circle of radius " + radius + " is: " + area);
        }*/

        while (radius < 0) {
            System.out.println("You entered a negative value for the radius, please input a positive number");
            radius = input.nextDouble();
        }

        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }

}
