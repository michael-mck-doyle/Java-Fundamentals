package practicePackage.Conditions_Loops;

public class Flow_Control {

    public static void main(String[] args){
        int i = 10;
        if(i > 0){
            System.out.print("Lorem");
            if (i > 10) {
                System.out.print(" Ipsum");
            } else if ( i > 5) {
                System.out.print(" Dolor");
            }
            System.out.print(" Sit");
            if (i >= 10) {
                System.out.print(" Amet");
            }
            System.out.print(" Consectetur");
        }
    }
}
