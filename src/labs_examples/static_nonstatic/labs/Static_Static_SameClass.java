package labs_examples.static_nonstatic.labs;

public class Static_Static_SameClass {

    static String name;
    static String surname;




    static void printName() {

        System.out.println("Print first name is Michael");
    }

    static void surname (String surname){

        printName();
        System.out.println("Print surname is " + surname);

    }

    public static void main(String[] args) {


        surname("Doyle");

    }
}
