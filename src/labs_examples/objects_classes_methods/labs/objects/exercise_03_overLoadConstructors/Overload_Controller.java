package labs_examples.objects_classes_methods.labs.objects.exercise_03_overLoadConstructors;

public class Overload_Controller {

    public static void main(String[] args) {


        Bottle bottle1 = new Bottle("plastic", 500, false  );

        System.out.println("Bottle 1 is made from " + bottle1.material + ". It holds " + bottle1.size + " mls."
                + " Is it recycleable ? " + bottle1.recycleable );

        Bottle bottle2 = new Bottle("glass", true);
        System.out.println("Bottle 2 is made from " + bottle2.material
                + " Is it recycleable ? " + bottle2.recycleable );

        Bottle bottle3 = new Bottle();
        System.out.println("We don't know much about bottle 3 yet.");
    }
}
