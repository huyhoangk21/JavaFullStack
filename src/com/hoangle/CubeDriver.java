package com.hoangle;

import java.util.Scanner;

/**
 *  This is HW1, problem 3
 *  A cube driver class
 */
public class CubeDriver {

    /**
     * Main method for this application
     * @param args arguments from command line.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a side length:");
        double length = sc.nextDouble();

        Cube cube = new Cube(length);
        System.out.println("The surface area is " + cube.surfaceArea());
        System.out.println("The volume is " + cube.volume());
    }
}
