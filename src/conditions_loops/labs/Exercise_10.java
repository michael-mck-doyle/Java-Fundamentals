package conditions_loops.labs;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {


    public static void main(String[] args) {
        // please demonstrate the use of the "continue" keyword below within a for loop


        for (char ch = 'a'; ch <='z'; ch++) {
            if (ch == 'd' || ch == 'e' || ch == 'f') {
                continue;
            }

            System.out.println("The letters of the alphabet are " + ch);
        }
        System.out.println();
    }
}

