package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        double radius = 3.14;
        int    height = 5;
        float pi = 3.14f;

        //calculate volume of cylinder using formula: height x π x radius(squared)
        double volume = height * pi * (radius*radius);


        // calculate surface area of cylinder using formula: π x radius x 2 x (radius + height)
        double surface_area = pi * radius * 2 * (radius + height);

        System.out.println("The volume of the cylinder is: " + volume);
        System.out.println("The surface area of the cylinder is " + surface_area);


    }
}
