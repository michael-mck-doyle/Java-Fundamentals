package labs_examples.datatypes_operators.labs;

public class Exercise_2a {


    /**
     * Data Types and Operators Exercise 2: Type conversion and casting
     *
     *      Write the necessary code to demonstrate type conversion:
     *
     *      Widening:
     *      1. Declare and initialize an int with the value 10
     *      2. Declare a double and set it equal to the int
     *      3. Print out the double
     *
     *      Narrowing (with casting):
     *      1. Declare and initialize a new double with the value 10.5
     *      2. Declare a new int and set it equal to the double (make sure to cast the double to an int)
     *      3. Print out the int
     *
     *      Notice how each type is converted. In which direction is information lost?
     *
     */



        public static void main(String[] args) {
            //widening type conversion
            int x = 10;
            double y = x;
            System.out.println(y);

            //narrowing with casting

            double a = 10.5;
            int b = (int) a;
            System.out.println(b);

        }
    }

