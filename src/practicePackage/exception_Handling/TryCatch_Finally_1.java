package practicePackage.exception_Handling;

public class TryCatch_Finally_1 {


    public static void main(String[] args) {

        int[] nums = { 23, 12, 18};

        try {

            System.out.println(nums[5]);

            int x = nums[1] / nums[3];

            System.out.println(x);

        } /*catch (ArrayIndexOutOfBoundsException exc1){
            System.out.println("Error detected in array");
            exc1.printStackTrace();

        } */  catch (ArithmeticException newExc) {
            System.out.println("Arithmetic Exception class triggered");
            newExc.printStackTrace();

        }   finally {

            System.out.println("Finally has been reached!");
        }

        System.out.println("Finished!");

    }
}

