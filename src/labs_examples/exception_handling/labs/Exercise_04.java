package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */


class NestedTryCatch_Exercise_04 {

    public static void main(String[] args) {

        int x = 0;
        int y = 0;

        try {


            while (x < 5) {

                System.out.println(x);

                x++;

                int a = x / 0;

            } try {

                int z = 10 / 2;

            } catch (ArithmeticException exc1) {

                System.out.println("Got you!");
            }
        } catch (ArithmeticException exc2 ) {

            System.out.println("Caught you buddy! We're good now.");
        }
    }

}

