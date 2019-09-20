package practicePackage.Inheritance;

public class Car {


    String make;
    static String model;
    int doors;
    int price;

    public Car() {

    }

    public Car(String make, String model, int doors, int price){
        this.make = make;
        this.model = model;
        this.doors = doors;
        this.price = price;
    }

     protected static void sellCar (String make, String model, int doors, int price){

        System.out.println("This " + make + ", model, " + model + " has " + doors + " doors."
                + " The selling price is " + price + " dollars.");
    }
}


