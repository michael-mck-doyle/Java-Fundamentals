package labs_examples.objects_classes_methods.labs.objects.exercise_01_aeroplane_2;

public class Aeroplane_Controller {


    public static void main(String[] args) {

        Manufacturer manufacturer = new Manufacturer("Boeing");
        Engines engines = new Engines(true);
        Catering meals = new Catering(true);
        Seating seat = new Seating(true, 10);

    Aeroplane newAeroplane = new Aeroplane(1000, 800, manufacturer, engines, meals, seat);

        System.out.println("The aeroplane manufactured by " + manufacturer.getManufacturer() + " has " + seat.getSeat() + " seats");





    }
}
