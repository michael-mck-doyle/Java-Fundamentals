package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 1: Even or Odd
 *
 *      Write a program that gets a number between 1 and 1,000,000
 *      from the user and determines whether it is odd
 *      or even using an if statement. Print the result.
 *
 *      NOTE: We will be using the Scanner class to collect user input. This is demonstrated below.
 */

public class Exercise_01_IfElse {

    public static void main(String[] args) {

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a number between 1 and 1,000,000,000 to determine whether it is odd or even: ");
        // assign input to variable as int
        int number = scanner.nextInt();

        // write completed code here
        if (number % 2 == 0) {
            System.out.println("You have entered an even number");
        } else {
            System.out.println("You have entered an odd number");

        }

        //second example
        // create scanner
        Scanner scanner2 = new Scanner(System.in);
        // prompt user - World Cup years fall on an even year every four years - enter a year
        //to check if a World Cup was held on that year
        System.out.print("Enter a year after 1950 to check if it was a World Cup year: ");
        // assign input to variable as int
        int number2 = scanner.nextInt();

        // write completed code here
        if ((number2 - 1950) % 4 == 0) {
            System.out.println("Goal! You have guessed a World Cup Year");
        } else {
            System.out.println("Penalty miss! Better luck next time...");

        }
        }


    }

