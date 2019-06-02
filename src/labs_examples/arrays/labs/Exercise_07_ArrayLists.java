package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07_ArrayLists {


    public static void main(String[] args) {

        ArrayList<String> oneYear = new ArrayList<String>();

        oneYear.add("January");
        oneYear.add("February");
        oneYear.add("March");
        oneYear.add("April");
        oneYear.add("May");
        oneYear.add("Monday");
        oneYear.add("June");
        oneYear.add("July");
        oneYear.add("August");
        oneYear.add("September");
        oneYear.add("Wednesday");
        oneYear.add("October");
        oneYear.add("November");
        oneYear.add("December");

        System.out.println(oneYear);
        System.out.println();

        String x = oneYear.get(5);
        System.out.println(x);

        oneYear.remove(x);
        System.out.println();

        System.out.println(oneYear);
        System.out.println();

        System.out.println(oneYear.isEmpty());

        System.out.println();
        System.out.println(oneYear.size());

        System.out.println();
        System.out.println(oneYear.indexOf("Wednesday"));

    }
}
