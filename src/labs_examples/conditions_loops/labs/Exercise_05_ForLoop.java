package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05_ForLoop {

    public static void main(String[] args) {

        // take number 1 from user
        // create scanner

        Scanner scannerOne = new Scanner(System.in);
        // prompt user
        System.out.print("Enter the first number: ");
        // assign input to variable as int
        int numOne = scannerOne.nextInt();

        // take number 2 from user
        // create a scanner
        Scanner scannerTwo = new Scanner(System.in);
        // prompt user
        System.out.print("Enter the second number. (Note: it must be higher than the first number): ");
        // assign input to variable as int
        int numTwo = scannerTwo.nextInt();


        int sum = 0;
        double average = ((numOne + numTwo)/ (double)2);

        for ( ; numOne <= numTwo; numOne++) {

            sum = sum + numOne;


        } System.out.println("The sum of the numbers is " + sum);
        System.out.println("The average of the numbers is " + average);


    }

}

