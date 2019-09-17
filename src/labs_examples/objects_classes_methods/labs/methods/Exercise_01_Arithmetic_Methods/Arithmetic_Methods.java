package labs_examples.objects_classes_methods.labs.methods.Exercise_01_Arithmetic_Methods;

public class Arithmetic_Methods {


    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()

        //int multiply method
        int a = multiply(7,6);
        System.out.println(a);

        //int divide method
        int b = divide(136,7);
        System.out.println(b);

        //bad joke section
        joke("What do you call a fish with no eyes?");

        //years to seconds
        int c = years(12);
        System.out.println(c);
        // number of strings in a varArg
        int d = varArgs("This","String","is","not","very","long");
        System.out.println(d);
    }

    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static int multiply(int x, int y) {

        return x * y;
    }


    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static int divide(int x, int y) {

        return x/y;
    }

    // 3) Create a static void method that will print of joke of your choice to the console
    public static void joke(String joke) {
        System.out.println(joke);
    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static int years(int x) {

        return x*365*24*60*60;
    }

    // 5) Create a varargs method that will return the length of the varargs array passed in
    public static int varArgs(String...x) {
        int count = 0;

        for (String y: x) {
            count++;

        }
        return count;
    }


}
