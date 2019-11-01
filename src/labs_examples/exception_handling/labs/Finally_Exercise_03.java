package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */

public class Finally_Exercise_03 {

    public static void main(String[] args) {

        int[] num = {2, 4, 6, 8};

        try {
            int y = num[3] - num[0];

            System.out.println(y);

        } catch (ArithmeticException exc) {

            System.out.println("Arithmetic Exception found in class calculation.");
        } catch (ArrayIndexOutOfBoundsException arrExc) {

            System.out.println("Array Index out of Bound Exception caused by calculation error");
        } finally {
            System.out.println("I think we're good here now!");
        }
    }
}
