package labs_examples.arrays.labs;

public class Exercise_00_Practice_File3 {

    public static void main(String[] args) {

        // please demonstrate how to declare a Two-Dimensional Array
        // with a height of 4 and a width of 5 below
        int[][] multiInt = new int[4][5];
        // using a nested for loop, please populate every index in the 2-D Array
        for (int x = 0; x < multiInt.length; x++) {
            for (int y = 0; y < multiInt[x].length; y++) {
                multiInt[x][y] = x*y;
                //System.out.println(multiInt[x][y]);
            }
        }
        // once populated, use a nested for loop to print each element in the 2-D array
        System.out.println(multiInt[1][3]);
    }
}
