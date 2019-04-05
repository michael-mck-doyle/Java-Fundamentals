package practicePackage;

public class method_Override_Practice_4 {

    public static void main(String[] args) {

        Boat tug = new Boat();

        Boat yacht = new Sailboat();

        yacht.start();

        tug.start();

    }
}

//parent class Boat

class Boat {

    int maxKnots;
    int fuelConsumption;
    String type;

    //parent method starting
    public void start() {
        System.out.println("To start...switch on engines...");

    }
}

// child class Sailboat
class Sailboat extends Boat {

    Sailboat() {
        maxKnots = 30;
        fuelConsumption = 0;
        type = "non-motorised";

    }
    // the method below overrides the behavior of the start() method in the Boat class
    @Override
    public void start() {

        System.out.println("To start...lower the sails...");
    }
}

