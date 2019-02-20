package conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a number from 1 to 7: ");
        // assign input to variable as int
        int number = scanner.nextInt();


        // 4) write completed code here

        if (number == 1) {
            System.out.println("You have selected Monday");
        }
        if (number == 2) {
            System.out.println("You have selected Tuesday");
        } else if (number == 3) {
            System.out.println("You have selected Wednesday");
        } else if (number == 4) {
            System.out.println("You have selected Thursday");
        } else if (number == 5) {
            System.out.println("You have selected Friday");
        } else if (number == 6) {
            System.out.println("You have selected Saturday");
        } else if (number == 7) {
            System.out.println("You have selected Sunday");
        } else {
            System.out.println("Please choose a number between 1 and 7");


        }

    }
}







