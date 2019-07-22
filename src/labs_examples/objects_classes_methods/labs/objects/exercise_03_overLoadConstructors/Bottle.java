package labs_examples.objects_classes_methods.labs.objects.exercise_03_overLoadConstructors;

public class Bottle {

    String material;
    int size;
    boolean recycleable;

    public Bottle(String material, int size, boolean recycleable) {

       this.material = material;
        this.size = size;
        this.recycleable = recycleable;
    }

    public Bottle(){}

    public Bottle(String material, boolean recycleable) {

        this.material = material;
        this.recycleable = recycleable;
    }

}
