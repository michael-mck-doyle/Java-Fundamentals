package labs_examples.conditions_loops.labs;

import javax.xml.bind.SchemaOutputResolver;
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

public class Exercise_01_Practice_File {

    //public static void main(String[] args) {

        // create scanner
        //Scanner scanner = new Scanner(System.in);
        // prompt user
        //System.out.print("Enter a number between 1 and 1,000,000,000 to determine whether it is odd or even: ");
        // assign input to variable as int
        //int number = scanner.nextInt();

        // write completed code here

        // if statement practice below

        /*int i = 10;

        /*if (i > 0) {
            if (i < 20) {
                System.out.println("i is greater than zero but less than 20");
                //you could keep nesting if statements here if you want/need*/

        /*if (i > 0) {
            // i is greater than zero
            System.out.println("i is greater than zero");
        } else if (i < 0){
            // i is less than zero
            System.out.println("i is less thann zero");
        } else {
            // i is equal to zero
            System.out.println("i is equal to zero");
        }*/


        /*if (i > 0) {
            System.out.print("Lorem");
            /*if (i > 10) {
                System.out.print(" Ipsum");
            } else if (i > 5) {
                System.out.print(" Dolor");
            }
            System.out.print(" Sit");
            if (i >= 10) {
                System.out.print(" Amet");
            }
            System.out.print(" Consectetur");
        } */



        /*if(i >= 0) {
            if (i > 10) {
             if (i > 20){
                System.out.println("happy bear");
            } System.out.println("comfy monkey");
        } System.out.println("serious sloth");
    } else {
        System.out.println("fast dog");
    }
    System.out.println("agile lizard");*/

       /* char c = 'a';
        if (c > 90) {
            System.out.println(" c is greater than 90");
            if (c > 100) {
                System.out.println("c is greater than 100");
            } else if (c == 97) {
                System.out.println(" the value of c is 97");
            } else {
                System.out.println(" we don't know the exact value of c yet");
            }
        }


        int a = 2;
        int b = 8;
        // assign the value returned from returnSum() to the variable sum
        int sum = returnSum(a, b);
        // print out the sum of a and b
        System.out.println("The sum is: " + sum);
        //change the value of a
        a = 10;
        // change the value of b
        b = 5;
        // call the "printSum()" method
        printSum(a, b); // call printSum()
    }
    // the method below has a return type of int - as shown in the line below
    public static int returnSum(int a, int b){
        // calculates and returns the sum of the two parameters
        return a * b;
    }
    // the method below has "void" as a return type - it does not return a value
    public static void printSum(int a, int b){
        // calculates the sum of the two parameters
        int sum = a + b;
        // prints out the sum
        System.out.println("The sum is: " + sum);
        // the return keyword is not required on a void method
    }

    public static void earlyExit(){
        for(int i = 0; i < 10; i++){
            if (i == 4){
                // if "i" is equal to 4 - exit the method
                return;
            }
            System.out.println("i = " + i);
        }
    }

        int x = 1;
        while (x < 11) {
            System.out.println("x is : " + x);
            x++;
        }

        for(int i = 0; i < 3; i++){
            System.out.println("Loop " + i + ":");
            for(int x = 0; x < 3; x++){
                System.out.println("i * x = " + (i * x));
            }
            System.out.println("-------------");
        }

        System.out.println("Starting...");
        for (int i = 0; i < 10; i++){
            System.out.println("** Outter Loop - i = " + i + " **");
            for (int j = 0; j < 7; j++){
                System.out.print("Inner Loop: j = " + j + " | ");
            }
            // this is just two line breaks
            System.out.println("\n\n");
        }
        System.out.println("Done!");
    }



        //switch statements - it's important to have the break statement
        // otherwise all options after the trigger will also be displayed
        // the break statement exits the switch statement after the condition has been triggered


        int hour = 0;
        switch (hour) {
            case 1:
                System.out.println("It is one o'clock");
                break;
            case 2:
                System.out.println("It is two o'clock");
                break;
            case 3:
                System.out.println("It is three o'clock");
                break;
            case 4:
                System.out.println("It is four o'clock");
                break;
            default:
                System.out.println("Default was hit");
        }
        //the Switch statement also works with letters
        char letter = 'a';
        switch (letter) {
            case 'a':
                System.out.println("It is one o'clock");
                break;
            case 'b':
                System.out.println("It is two o'clock");
                break;
            case 'c':
                System.out.println("It is three o'clock");
                break;
            case 'd':
                System.out.println("It is four o'clock");
                break;
            default:
                System.out.println("Default was hit");
        }

        public static void main(String[] args){
            demonstrateVoidReturn(21);
            int a = multiply(456, 987);
            System.out.println("a = " + a);
        }

        public static void demonstrateVoidReturn(int num){
            if (num < 20) {
                // we will simply exit this method without doing anything else if num is less than 20
                return;
            } else {
                System.out.println("num is >= 20");
            }
        }

        public static int multiply(int a, int b){
            int x = a * b;
            // now we'll return the int value x to the calling method this method
            //  declares "int" as it's return type and we're returning an int so all is well
            return x;
        }*/

    }









