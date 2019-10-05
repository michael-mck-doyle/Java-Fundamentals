package practicePackage.static_nonstatic_variables_methods;


class StaticBlockExample {

    static int num;
    static String mystr;

    static {

        num = 97;
        mystr = "Static variable instantiated in static block";
    }

    public static void main(String[] args) {

        System.out.println("Value of num is " + num);
        System.out.println("Value of mystr is " + mystr);
    }

}



