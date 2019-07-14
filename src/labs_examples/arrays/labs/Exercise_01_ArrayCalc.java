package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01_ArrayCalc {


    public static void main(String[] args) {

        int[] nums = new int[10];
        int sum = 0;
        int average = 0;
        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        for (int n = 0; n < nums.length; n++) {
            System.out.print("Enter a number: ");
            // assign input to variable as int
           //int numEnter = scanner.nextInt();

            //nums[n] = numEnter;
            nums[n] = scanner.nextInt();

        } for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            average = (sum/10);

        }
        System.out.println();
        System.out.println("The sum of the numbers entered is " + sum);
        System.out.println("The average of the numbers entered is " + average);


    }

}
