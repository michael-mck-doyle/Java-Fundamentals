package labs_examples.static_nonstatic.labs;

public class Static_Static_DifferentClass {

    public static void main(String[] args) {

        Static_1.static_1();

        //Static_2.static_2();

    }

}




class Static_2 {

    static void static_2() {

        System.out.println("Second static method");
    }
}


class Static_1 {

    static void static_1() {

        System.out.println("First static method");

        Static_2.static_2();

    }
}