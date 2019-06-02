package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()

        //int multiply method
        int x = multiply(4, 2);

        System.out.println("The value of x is " + x);

        //int divide method
        int y = divide(9, 3);
        System.out.println("The value of y is " + y);

        //bad joke section
        joke("joke");

        //years to seconds
        int seconds = seconds(3);

        System.out.println("The number of seconds in " + y + " years is " + seconds);

        // number of strings in a varArg

        int v = varLength("hello", "I", " am", "a", "varArg");

        System.out.println("The number of words in v is " + v);
    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b

    static int multiply(int a, int b) {

        int multiply = a * b;

        return multiply;
    }


    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b

    static int divide(int a, int b) {

        int divide = a / b;

        return divide;
    }

    // 3) Create a static void method that will print of joke of your choice to the console


    static void joke(String j) {


        System.out.println("What do you call a dear with no eyes? No idea!");
    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents

    static int seconds(int y) {

        int secs = y * 365 * 24 * 60 * 60;

        return secs;
    }

    // 5) Create a varargs method that will return the length of the varargs array passed in

    static int varLength(String... v) {

        int count = 0;

        for (String n : v) {
            count++;

        }
        return count;

    }
}



