package labs_examples.arrays.labs;


/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05_ArrayBackwards {

    public static void main(String[] args) {


        int[] reverseArray = new int[10];

        for (int i = 0; i < reverseArray.length; i++) {


            reverseArray[i] = i * 10;
            System.out.println(reverseArray[i]);

        }
        System.out.println();

        for (int i = 9; i >= 0; i-=2) {
            System.out.print(reverseArray[i] + "|");
        }
    }
}




