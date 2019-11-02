package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */
class ThrowException_Exercise_05{

    public static void main(String[] args) {

        try{
            arithException();
        } catch (ArithmeticException exc1) {

            System.out.println("Thanks heavens...you caught me!");
        }
    }

public static void arithException() throws ArithmeticException {

    try {
        // we can see that the divide() method below "throws" an exception (potentially - based on input)
        // so we need to use a try catch here to catch the exception that may be thrown

        int x = divide(4, 2);

        System.out.println("x = " + x);

    } catch (ArithmeticException exc) {
        System.out.println("choose any number to divide by except zero");

        throw exc;
    }
}


public static int divide(int a, int b) throws ArithmeticException {
        return a/b;
        }

}