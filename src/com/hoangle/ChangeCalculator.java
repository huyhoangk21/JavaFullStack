package com.hoangle;

import java.util.Scanner;

/**
 * This is HW1, problem 1
 * This class calculates change
 */
public class ChangeCalculator {

    /**
     * Main method for this application
     * @param args arguments from command line.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an amount:");
        double amount = sc.nextDouble();

        String[] bills = {"twenty dollar bills", "ten dollar bills",
                "five dollar bills", "one dollar bills", "quarters", "dimes", "nickels", "pennies"};

        double[] values = {20.0, 10.0, 5.0, 1.0, 0.25, 0.10, 0.05, 0.01};

        int[] changes = new int[bills.length];

        for (int i = 0; i < bills.length; i++) {
            while(amount >= values[i]) {
                amount -= values[i];
                changes[i]++;
            }
        }

        for (int i = 0; i < bills.length; i++) {
            System.out.println(changes[i] + " " + bills[i]);
        }
    }
}
