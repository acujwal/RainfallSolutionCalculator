package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double length, width, areaOfRoof, runoff ;

        int GallonInCubic = 231;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Rain Fall Calculation: \n ");
        System.out.println("Enter the length of the roof: ");
        length = keyboard.nextDouble();
        System.out.println("Enter the length of the roof: ");
        width = keyboard.nextDouble();


        areaOfRoof = areaCalculator(length,width) ;

        runoff = areaOfRoof / GallonInCubic;



        System.out.printf("The rainfall runoff in cubic  inches is :% .2f%n",runoff);


    }

    public static double areaCalculator(double length , double width  ){
        int footInInches = 12;
        Double area = (length*footInInches) * (width*footInInches);

        return area;

    }

}
