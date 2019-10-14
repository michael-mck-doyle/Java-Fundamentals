package practicePackage.exception_Handling;

public class Throws_Keyword {

    public static void main(String[] args) {

        try
        {
        int x = divide(4, 0);
    } catch (ArithmeticException one) {
            System.out.println("an exception was thrown from the divide() method");

        }
    System.out.println("All finished!");
}


    public static int divide(int a, int b) throws ArithmeticException {

        return a/b;


    }
        }
