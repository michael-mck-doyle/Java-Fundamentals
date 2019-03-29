package labs_examples.objects_classes_methods.labs.oop.A_inheritance.House_Exercise_01;

public class House_Controller {


    public static void main(String[] args) {

        House newHouse  = new House(11, "Emerald Avenue");

        System.out.println(newHouse);

        System.out.println((newHouse.getHouseNumber()) + " " + newHouse.getStreetName());

        newHouse.setHouseNumber(15);
        newHouse.setStreetName("Ruby Road");

        System.out.println((newHouse.getHouseNumber()) + " " + newHouse.getStreetName());

        //Blinds venetian = new Blinds(18, "Diamond", 3, 2, "Rectangle", "green", "horizontal", "laminated veneer",
                //180, 250 );

        Room roomColour = new Room();

        roomColour.paintRoom("Green");

        System.out.println(venetian);

        Windows bedroomWindow = new Windows();

        bedroomWindow.paintRoom("Green", "White");

        Blinds blindsCost = new Blinds();





    }
}
