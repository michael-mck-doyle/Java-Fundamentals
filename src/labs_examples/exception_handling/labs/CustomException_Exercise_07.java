package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */




public class CustomException_Exercise_07 {


    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        try {

            System.out.println(nums[5]);

        } catch (ArrayIndexOutOfBoundsException exc) {

            System.out.println(exc.toString());
        }

        class JavaPractice extends Exception {

            @Override
            public String toString() {
                return "You need more Java practice!";
            }
        }
    }
}


