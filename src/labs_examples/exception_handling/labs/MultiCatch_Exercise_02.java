package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */


public class MultiCatch_Exercise_02 {

    public static void main(String[] args) {

        int[] num = {2, 4, 6, 8};

        try {
            int y = num[5] - num[0];

            System.out.println(y);

        } catch (ArithmeticException exc) {

            System.out.println("Arithmetic Exception found in class calculation.");
        } catch (ArrayIndexOutOfBoundsException arrExc) {

            System.out.println("Array Index out of Bound Exception caused by calculation error");
        }
    }
}