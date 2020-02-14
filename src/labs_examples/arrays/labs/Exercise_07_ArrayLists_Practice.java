package labs_examples.arrays.labs;

import java.util.ArrayList;

public class Exercise_07_ArrayLists_Practice  {

        public static void main(String[] args) {

            // please demonstrate how to declare an ArrayList below

            ArrayList<Integer> num = new ArrayList();
            // please demonstrate how to add values to an array ArrayList
            num.add(10);
            num.add(20);
            num.add(30);
            num.add(40);
            num.add(50);
            num.add(60);
            num.add(70);
            num.add(80);
            num.add(90);

            // please demonstrate how to remove values from an ArrayList
            num.remove(5);
            // please demonstrate how to retrieve values from an ArrayList

            // please demonstrate at least two other useful methods available
            // to us when we use ArrayLists
            System.out.println(num);

            System.out.println(num.size());

            for (int i = 0; i < num.size(); i++) {
                System.out.println(num.get(i));
            }
            System.out.println("----------");

            for (int i : num) {
                System.out.println(i);
            }

        }
    }

