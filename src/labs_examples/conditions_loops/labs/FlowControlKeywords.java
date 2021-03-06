package labs_examples.conditions_loops.labs;

public class FlowControlKeywords {

    public static void main(String[] args) {

        //Continue keyword

        for (int x = 0; x < 100; x += 1) {

            if (x % 3 != 0) {

                continue;

            }
            System.out.println("x = " + x);
        }

        System.out.println();

        //Break keyword

        for (int y = 0; y < 100; y += 1) {

            if (y == 8) {

                break;

            }

            System.out.println("y = " + y);

        }

        int c = someMethod(18);
        System.out.println(c);

        System.out.println();

        // please demonstrate the use of the "continue" keyword below within a for loop
        for (int x = 0; x < 12; x++) {
            if(x == 5 || x == 6) {
                System.out.println("We are skipping 5 & 6");
                continue;
            } System.out.println("x = " + x);
        }

        // please demonstrate the use of the "break" keyword below in a do-while loop
        int y = 1;
        do {
            System.out.println("y = " + y);
            if (y == 8){
                break;
            } y++;
        } while (y < 12);


    }
    // Return keyword


    public static int someMethod(int a) {

        int b = a % 2;

        if (b != 0) {
            System.out.println(" 'a' is an odd number");
            return b;
        }
        else if (b == 0) {
            System.out.println("'a' is an even number");
            return a;

        } else {
            System.out.println(" 'a' is from another dimention" +
                    "");
            return a;
        }

    }
}



