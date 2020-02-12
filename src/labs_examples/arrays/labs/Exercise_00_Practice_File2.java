package labs_examples.arrays.labs;

public class Exercise_00_Practice_File2 {

    public static void main(String[] args) {

        String[][] calendar = new String[7][4];

        calendar[0][0] = "Monday";
        calendar[0][1] = "Morning";
        calendar[0][2] = "Afternoon";
        calendar[0][3] = "Evening";
        calendar[1][0] = "Tuesday";
        calendar[1][1] = "Morning";
        calendar[1][2] = "Afternoon";
        calendar[1][3] = "Evening";
        calendar[2][0] = "Wednesday";
        calendar[2][1] = "Morning";
        calendar[2][2] = "Afternoon";
        calendar[2][3] = "Evening";
        calendar[3][0] = "Thursday";
        calendar[3][1] = "Morning";
        calendar[3][2] = "Afternoon";
        calendar[3][3] = "Evening";
        calendar[4][0] = "Friday";
        calendar[4][1] = "Morning";
        calendar[4][2] = "Afternoon";
        calendar[4][3] = "Evening";
        calendar[5][0] = "Saturday";
        calendar[5][1] = "Morning";
        calendar[5][2] = "Afternoon";
        calendar[5][3] = "Evening";
        calendar[6][0] = "Sunday";
        calendar[6][1] = "Morning";
        calendar[6][2] = "Afternoon";
        calendar[6][3] = "Evening";

        int y;

        for (int x = 0; x < calendar.length; x++) {



            for (y = 0; y < calendar[x].length; y++) {

                String s = calendar[x][y];

                System.out.println(s);
            }

        }

    }
}
