package practicePackage;

import java.sql.SQLOutput;

public class finalVariable_Practice_5 {

    //it is not possible to modify a final variable
    //ALL CAPS LOCK for final variable names is common and accepted convention in Java

    public final double PI = 3.14;

    public double getCircumference (double radius) {

        return (2 * PI * radius);
    }
}


class Circumference {

    public static void main(String[] args) {

        finalVariable_Practice_5 circumference = new finalVariable_Practice_5();

        System.out.println(circumference.getCircumference(12));

    }
}