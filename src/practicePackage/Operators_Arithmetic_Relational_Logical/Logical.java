package practicePackage.Operators_Arithmetic_Relational_Logical;

public class Logical {

    public static void main(String[] args) {

        boolean truVal = true;
        boolean falseVal = false;

        if (truVal) {

            System.out.println("true");
        }

        if (falseVal) {
            System.out.println("false");
        }

        if (truVal & falseVal) {

            System.out.println("both the same");
        }

        if (truVal && falseVal) {
            System.out.println("both the same");
        }

        if (truVal ^ falseVal) {

            System.out.println("either OR");
        }

        if (truVal | falseVal) {
            System.out.println("NOT");
        }

        if (!falseVal) {
            System.out.println("must be true");
        }
    }
}
