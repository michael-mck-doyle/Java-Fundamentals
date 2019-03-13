package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate an irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04_IrregArray {

    public static void main(String[] args) {

        int[][] irregArray = {{12, 24}, {11, 22, 33}, {10, 20, 30, 40}};


        for (int[] x : irregArray) {
            for (int y : x) {
                System.out.print(y + " -> ");
            }
            System.out.println();
        }
    }
}


