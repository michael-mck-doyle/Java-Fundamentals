package labs_examples.arrays.labs;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Exercise_00_Practice_File {


        public static void main(String[] args) {
            /* please demonstrate how to declare and initialize a
            // String array of size five below

            int[] num = new int[5];

            num[0] = 2;
            num[1] = 4;
            num[2] = 6;
            num[3] = 8;
            num[4] = 10;

            // once initialized, please populate each index of the array

            // once populated, please print out each element in the array
            // using a For Loop

            for (int x = 0; x < num.length; x++) {

                System.out.println("num[" + x + "] = " + num[x]);
            }

        int[][] twoD = new int[4][7];

        for (int i = 0; i < twoD.length; i++ ) {

            for (int j = 0; j < twoD[i].length; j++) {
                twoD[i][j] = i + j + 3;
                System.out.print(twoD[i][j] + " - ");
            }
            System.out.println();
        }

                // create new ArrayList of String

                ArrayList<String> list = new ArrayList();
                // add values to ArrayList
                list.add("Hello");
                list.add("World");
                list.add("!");
                // if the list is not empty
                if (!list.isEmpty()){
                        // iterate over ever element in the ArrayList and print it
                        for (String s : list){
                                System.out.print(s + " ");
                        }
                }

            ArrayList<String> arList = new ArrayList<>();

            arList.add("Water");
            arList.add("the");
            arList.add("plants");

                for (String s : arList) {

                        System.out.print(s + " ");

                } arList.lastIndexOf();


        }

            // for-each loops and one-dimensional arrays

        int[] vals = new int[5];
        // we'll use a traditional for loop to populate the array
        // because we need to use indexes to place the values in the array
    for (int i = 0; i < vals.length; i++){
                vals[i] = i * 2;
        }
        // currently, the "vals" array looks like [0, 2, 4, 6, 8]

        // now we'll use a For-Each Loop to iterate through the array and print each value
    for(int val : vals){
                // here "val" is the actual value in "vals"
                // the for-each loop will iterate through the array from
                // top to bottom - on each loop the value of "val" will change
                System.out.println(val);
        }*/

                // for-each loops and two-dimensional arrays
                // use a traditional for-loop to populate an array and then a for-each loop to print out each value

                int[][] nums = new int[5][10];
                for (int i = 0; i < nums.length; i++){
                        for (int j = 0; j < nums[i].length; j++){
                                nums[i][j] = (i * j) * 7 / 3;
                        }
                }
                for(int[] outer : nums){
                        for(int val : outer){
                                System.out.print(val + " -> ");
                        }
                        System.out.println();
                }
        }
}





