package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 */

public class Exercise_07 {

    public static void main(String[] args) {

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a word: ");
        // assign input to variable as char
        String word = scanner.nextLine();
        int vow = 0;

        while (vow <= word.length()) {

            if (word.charAt(vow) == 'a') {
               System.out.println("The first vowel is 'a' ");
                break;
            } else if (word.charAt(vow) == 'e') {
                System.out.println("The first vowel is 'e' ");
                break;
            } else if (word.charAt(vow) == 'i') {
                System.out.println("The first vowel is 'i'");
                break;
            } else if (word.charAt(vow) == 'o') {
                System.out.println("The first vowel is 'o'");
                break;
            } else if (word.charAt(vow) == 'u') {
                System.out.println("The first vowel is 'u'");
                break;
            } else {
                System.out.println("The word entered was " + word);
            }


            vow++;
            }


        }



    }



