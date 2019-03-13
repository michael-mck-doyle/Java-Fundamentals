package labs_examples.arrays.labs;

/**
 *  2D Array
 *
 *      Creat and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03_2DArray {

    public static void main(String[] args) {

        int[][] twoDArray = new int[5][5];


        for (int x = 0; x < twoDArray.length; x++){
            for (int y = 0; y < twoDArray[x].length; y++){
                twoDArray[x][y] = (x * y) * 3;
            }
        }
        for(int[] outer : twoDArray){
            for(int val : outer){
                System.out.print(val + " -> ");
            }
            System.out.println();
        }
    }
    }

