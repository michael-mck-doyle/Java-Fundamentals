package labs_examples.objects_classes_methods.labs.objects.exercise_04_Garden;

public class GardenController {

    public static void main(String[] args) {


        Lawnmower newLawnmover = new Lawnmower("Green", 6);
        Sprinkler newSprinkler = new Sprinkler(true, 12);
        Garden newGarden = new Garden(50, true);

        System.out.println("My garden is " + newGarden.gardenArea + "" );
    }
}
