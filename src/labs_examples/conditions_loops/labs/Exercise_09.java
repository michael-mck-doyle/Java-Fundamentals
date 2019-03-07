package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {

    public static void main(String[] args) {

        int year = 1971;
        do {
            System.out.println("The current year is " + year);
            year ++;
            if (year == 2020) {
                break;
            }
        } while (year >= 1970 && year<2025);

    }
}

