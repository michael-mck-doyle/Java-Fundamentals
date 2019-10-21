package practicePackage.exception_Handling;

public class ExceptionHandling_Examples_1 {

    public static void main(String[] args) {

        int[] nums = { 23, 12, 18};

        try {
            System.out.println(nums[3]);

        } catch (ArrayIndexOutOfBoundsException exc1){
            System.out.println("Error detected");
            exc1.printStackTrace();
        }


        System.out.println("Program Complete");
    }
}
