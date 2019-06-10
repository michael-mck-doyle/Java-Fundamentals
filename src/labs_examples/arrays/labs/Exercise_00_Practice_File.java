package labs_examples.arrays.labs;

public class Exercise_00_Practice_File {


        public static void main(String[] args) {
            // please demonstrate how to declare and initialize a
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

        }
    }

