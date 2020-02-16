package labs_examples.arrays.labs;

import java.util.ArrayList;

public class Exercise_00_ForEach_Practice {

    public static void main(String[] args) {

        int[][] nums = new int[5][10];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (i * j) * 7 / 3;
            }
        }

        for (int[] outer : nums) {
            for (int val : outer) {
                System.out.print(val + " -> ");
            }
            System.out.println();
        }

        // please declare an array or arraylist below
        ArrayList<String> list = new ArrayList();
        //ArrayList<String> cars = new ArrayList();
        //ArrayList<String> cars = new ArrayList<String>();
        //ArrayList<String> list = new ArrayList();
        // please populate that array or arraylist
        list.add("Mazda");
        list.add("Hello");
        list.add("Honda");
        list.add("Toyota");
        list.add("BMW");
        list.add("Range Rover");

        // please use a For Each Loop to print each element

        for (String i : list) {
            System.out.println(i);
            // in the array or arraylist you declared and populated above
        }
    }

}

