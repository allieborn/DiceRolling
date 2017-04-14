package com.InClassLabs;

import java.util.Scanner;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Programming Casino!");

        String userInput = "Y";

        do {
            System.out.println("Enter how many sides will be on your dice: ");
            int sideOfDice = scan.nextInt();
            System.out.println("Enter 'R' to roll your dice now!");
            scan.nextLine();
            String rollMe = scan.nextLine();

            if (rollMe.equalsIgnoreCase("R")) {

                System.out.println(randomGenerator(sideOfDice));
                System.out.println(randomGenerator(sideOfDice));

                System.out.println("Would you like to keep playing? (Y/N)");
                userInput = scan.nextLine();
            }
        } while (userInput.equalsIgnoreCase("Y"));

        System.out.println("See you next time!");
    }


    public static int randomGenerator(int sideOfDice) {
        Random ranGen = new Random();
        int numYouRole;
        numYouRole = ranGen.nextInt(sideOfDice) + 1;
        return numYouRole;
    }

}
