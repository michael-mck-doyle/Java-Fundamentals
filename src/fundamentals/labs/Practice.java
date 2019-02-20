package fundamentals.labs;

public class Practice {

    public static int main(String[] args) {

        int retVal = 0;
        int testVal = 1;
        // use an if/else statement to check if testVal is less than zero
        if (testVal < 0) {
            System.out.println("testVal is less than zero");
        } else {
            System.out.println("testVal is not less than zero");

            // if the testVal is less than zero, subtract 1 from retVal below
            if (testVal < 0) {
                retVal -= 1;
            }
            // continue the if/else block below to check if testVal is equal to zero
            if (testVal == 0) {
                //  if testVal is equal to zero, add 10 to retVal below
                retVal += 10;
            }

            // continue the if/else block below to check if testVal is greater than zero
            if (testVal > 0) {
                // if testVal is greater than zero, add 100 to retVal below
                retVal += 100;
            }

            return retVal;
        }
        return retVal;
    }
}
