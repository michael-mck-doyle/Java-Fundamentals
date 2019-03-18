package labs_examples.objects_classes_methods.labs.objects.aeroplaneExercise_1;

public class aeroplaneController {

    public static void main(String[] args) {

        Gift gift1 = new Gift();
        gift1.setContents("Chocolate");

        Gift gift2 = new Gift();
        gift2.setContents("t-shirt");

        Luggage luggage1 = new Luggage();
        luggage1.getGifts().add(gift1);
        luggage1.getGifts().add(gift2);
        luggage1.setColour("Blue");
        luggage1.setWeight(22);
        luggage1.getColour();
        luggage1.getWeight();

        Passenger michael = new Passenger();
        michael.setName("Michael");
        michael.setLuggage(luggage1);

        Aeroplane aeroplane = new Aeroplane();
        aeroplane.getPassengers().add(michael);


        //next passenger below here

        Gift gift3 = new Gift();
        gift3.setContents("souvenir");

        Gift gift4 = new Gift();
        gift4.setContents("coffee");

        Luggage luggage2 = new Luggage();
        luggage2.getGifts().add(gift3);
        luggage2.getGifts().add(gift4);
        luggage2.setColour("Purple");
        luggage2.setWeight(23);
        luggage2.getColour();
        luggage2.getWeight();


        Passenger eileen = new Passenger();
        michael.setName("eileen");
        michael.setLuggage(luggage2);


        aeroplane.getPassengers().add(michael);

        describeAeroplane(aeroplane);

    }

    private static void describeAeroplane(Aeroplane aeroplane) {

        System.out.println(aeroplane.toString());
    }
}
