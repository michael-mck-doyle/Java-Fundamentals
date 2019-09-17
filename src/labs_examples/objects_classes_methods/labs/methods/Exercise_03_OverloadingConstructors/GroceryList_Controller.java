package labs_examples.objects_classes_methods.labs.methods.Exercise_03_OverloadingConstructors;

public class GroceryList_Controller {

    public static void main(String[] args) {


        Milk almond = new Milk(500, "non-dairy");

        System.out.println("Almond milk comes in a " + almond.size + " ml container and is " + almond.type);

        Milk longLife = new Milk(true);

        System.out.println("Will this uht milk last for a long time? " + longLife.uht);

        Milk dairy = new Milk();


    }

}
