package practicePackage.exception_Handling;

public class ReThrowing_Exceptions {

    public static void main(String[] args) {

        try {

            methodOne();
        } catch (ArrayIndexOutOfBoundsException acaught) {

            System.out.println("Thrown exception caught");
        }
    }




public static void methodOne() throws ArrayIndexOutOfBoundsException {





    methodTwo();

    System.out.println("Manually throwing exception to main method from methodOne");
}



public static void methodTwo() throws ArrayIndexOutOfBoundsException {

    int[] nums = {1,2,3};
    try {
        int x = nums[10];

    } catch (ArrayIndexOutOfBoundsException aexcep) {
        System.out.println("Exception caught in MethodTwo");
        System.out.println("Now manually throwing exception back to methodOne");
        throw aexcep;
    }

    }
}
