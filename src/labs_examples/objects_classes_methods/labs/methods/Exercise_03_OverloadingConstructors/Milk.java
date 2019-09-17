package labs_examples.objects_classes_methods.labs.methods.Exercise_03_OverloadingConstructors;

public class Milk {

    int size;
    String type;
    boolean uht;


    public Milk(int size, String type) {

        this.size = size;
        this.type = type;
    }



    public Milk(boolean uht) {

        this.uht = uht;

    }

    public Milk() {

        System.out.println("This milk is fresh dairy milk and comes in a 500ml container");
    }
}
