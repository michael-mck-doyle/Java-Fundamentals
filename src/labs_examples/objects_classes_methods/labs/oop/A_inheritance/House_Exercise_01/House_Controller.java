package labs_examples.objects_classes_methods.labs.oop.A_inheritance.House_Exercise_01;

// create a blinds objects for rooms in the house and calculate the cost using height, width and cost of material


public class House_Controller {


    public static void main(String[] args) {


        Blinds bedroomBlinds = new Blinds();

        bedroomBlinds.setBlindsColour("Green");
        bedroomBlinds.setBlindsHeight(170);
        bedroomBlinds.setBlindsWidth(220);
        bedroomBlinds.setBlindsMaterial("Silk");
        bedroomBlinds.setPriceMaterial(10);

        bedroomBlinds.blindsCost(170, 220, 10);

        System.out.println(bedroomBlinds.getCost());

        System.out.println("The bedroom blinds are " + bedroomBlinds.getBlindsColour());


        Blinds kitchenBlinds = new Blinds();
        kitchenBlinds.setBlindsColour("White");
        int kitchenBlindsCost = kitchenBlinds.blindsCost(50, 50, 3);

        System.out.println("The kitchen blinds are " + kitchenBlinds.getBlindsColour());
        System.out.println("Blinds height " + kitchenBlinds.getBlindsHeight());
        System.out.println("Blinds width " + kitchenBlinds.getBlindsWidth());
        System.out.println("Price of material is " + kitchenBlinds.getPriceMaterial());

        System.out.println("The bedroom blinds are " + kitchenBlindsCost);
    }
}
