package labs_examples.objects_classes_methods.labs.objects.Exercise_00_PracticePackage;

public class Resto_controller {

    public static void main(String[] args) {

        Water coldWater = new Water("tap", "cold");
        Glass regularGlass = new Glass(300,"plastic");
    Restaurant mexicanDiner = new Restaurant(15, regularGlass, coldWater);

        System.out.println(mexicanDiner);

        System.out.println("The restaurant has " + mexicanDiner.customers + " customers who are drinking water. " +
                "They are drinking from a " + mexicanDiner.myGlass.mls + " ml glass which is made from " +
                mexicanDiner.myGlass.material + ". The customers are drinking " + mexicanDiner.myWater.temp +
                " water from the " + mexicanDiner.myWater.type + ".");

    }
}
