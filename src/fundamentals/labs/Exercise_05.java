package fundamentals.labs;

import java.util.Scanner;

/**
 * Fundamentals Exercise 5: Days to seconds
 *
 *      Take in a number in days from the user between 1 and 1,000,000,000 and convert it to
 *      seconds.
 *
 *      NOTE: We will be using the Scanner class to collect user input. This is demonstrated below.
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a number in days between 1 and 1,000,000,000: ");
        // assign input to variable as int
        long days = scanner.nextInt();

        //calculate the number of seconds using formula: days * hours * minutes * seconds
        long seconds = (days * 24 * 60 * 60);

        System.out.println("The number of seconds in " + days + " days is " + seconds);
               // write completed code here

    }
}
