package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  Reversing an array in place
 *
 *
 *      This is a very common interview challenge.
 *
 *      Using a for loop, please demonstrate how to reverse an array in place using only one extra variable. Please note,
 *      you cannot use a second array and you can only instantiate one variable outside of the for loop.
 *
 */
public class Exercise_06_ReverseArray {

    public static void main(String[] args) {

        int[] newArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //int[] newArray = {10, 2, 3, 4, 5, 6, 7, 8, 9, 1};
        int x;

        for (int i = 0; i < newArray.length/2; i++) {
            x = newArray[i];
            newArray[i] = newArray[newArray.length - 1 -i];
            newArray[newArray.length -1 -i] = x;

        }
        for (int i : newArray) {

            System.out.print(i);

        }
    }

}
