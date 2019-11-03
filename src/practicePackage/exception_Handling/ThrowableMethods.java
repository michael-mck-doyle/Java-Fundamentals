package practicePackage.exception_Handling;

public class ThrowableMethods {



    public static void main(String[] args){

        int[] nums = {1,2,3};

        try {

            System.out.println(nums[10]);

        } catch (ArrayIndexOutOfBoundsException exc){

            exc.printStackTrace();
            System.out.println(exc.getMessage());
            System.out.println(exc.toString());
            System.out.println(exc.getLocalizedMessage());
            exc.fillInStackTrace();



        }
        System.out.println("Exception caught!");
    }

}
