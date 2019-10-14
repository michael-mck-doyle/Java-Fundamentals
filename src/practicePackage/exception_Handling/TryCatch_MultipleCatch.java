package practicePackage.exception_Handling;

public class TryCatch_MultipleCatch {


    public static void main(String[] args) {

        tryCatchExample.tryCatch();


    }
}

    class tryCatchExample {



    static void tryCatch() {

        int[] nums = {12, 0, 4, 9};

        try {

            int x = nums[0] / nums[2];

            System.out.println(x);

        } catch (ArithmeticException first) {
            System.out.println("Exception caught");
            
        } finally {

            System.out.println("Everything has finished now");
        }

    } {

        }
    }
