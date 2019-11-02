package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */

class ThrowAgain_Exercise_06 {


    public static void main(String[] args) {


        int[] nums = {0, 3, 4, 6, 8, 9};

        try {
            int c = divArrayNums(nums[3], nums[0]);

            System.out.println(c);


        } catch (ArithmeticException exc1){
            System.out.println("Catching exception thrown from divArrayNums");
        }
        System.out.println("Looks like we're good now.");
    }

    public static int divArrayNums(int a, int b) throws ArithmeticException {

        try {
            return a / b;
        } catch (ArithmeticException exc) {

            System.out.println("Looks like we have a problem here...throw again");

            throw exc;
        }
    }
}




