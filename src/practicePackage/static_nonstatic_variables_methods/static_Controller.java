package practicePackage.static_nonstatic_variables_methods;

public class static_Controller {

    public static void main(String[] args) {


        House house1 = new House(1000, "123 ABC Street");
        House house2 = new House(725, "Emerald Street");
        House house3 = new House(1200, "Ruby Road");

        System.out.println(house1.toString());
        System.out.println(house2.toString());
        System.out.println(house3.toString());


        House house4 = new House(1800, "Saphire Road");

        System.out.println(house4.toString());


    }
}
