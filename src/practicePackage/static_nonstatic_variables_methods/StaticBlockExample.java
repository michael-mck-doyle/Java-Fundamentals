package practicePackage.static_nonstatic_variables_methods;


class StaticBlockExample {

    static int num;
    static String mystr;

    static {

        System.out.println("Static Block 1");
        num = 97;
        mystr = "Static variable instantiated in static block 1";
    }

    static {

        System.out.println("Static Block 2");
        num = 33;
        mystr = "Static block 2 num overwrites Static block 1 num value";
    }

    public static void main(String[] args) {

        System.out.println("Value of num is " + num);
        System.out.println("Value of mystr is " + mystr);
    }

}



