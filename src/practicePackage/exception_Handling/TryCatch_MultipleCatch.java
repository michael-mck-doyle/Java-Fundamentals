package practicePackage.exception_Handling;

public class TryCatch_MultipleCatch {


    public static void main(String[] args) {

        System.out.println(tryCatchExample.tryCatch());


    }
}

    class tryCatchExample {

    static int[] nums = {3, 0, 7, 9};

    static int tryCatch() {

        try {

            int x = nums[0] / nums[1];

            return x;

        } catch (ArithmeticException first) {
            
        }

    return x; }
    }
