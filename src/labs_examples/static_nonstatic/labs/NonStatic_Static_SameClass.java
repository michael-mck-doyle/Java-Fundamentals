package labs_examples.static_nonstatic.labs;

public class NonStatic_Static_SameClass {

   static int x = 12;
   static int y = 14;

    // static method

    static int multiply(){

        return x * y;
    }

    // non-static method

    int multiplyAgain (int x){

       return multiply() * x;


    }

    // psvm

    public static void main(String[] args) {

        NonStatic_Static_SameClass result = new NonStatic_Static_SameClass();

        System.out.println(result.multiplyAgain(10));
    }

}
