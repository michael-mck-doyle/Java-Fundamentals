package practicePackage.Operators_Arithmetic_Relational_Logical;

public class Relational {

    static double x = 12.1;
    static double y = 12.2;

    public static void main(String[] args) {


        if ( x > y) {
            System.out.println( "x is more than");
        }
        if (x < y){
            System.out.println("x is less than");
        }

        if (x == y) {
            System.out.println("x is the same as y");
        }

        if (x != y) {

            System.out.println("x and y are different");
        }
    }

}
