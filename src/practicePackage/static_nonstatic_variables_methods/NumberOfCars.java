package practicePackage.static_nonstatic_variables_methods;

public class NumberOfCars {

    public static void main(String[] args) {

        Vehicle car = new Vehicle(4, "car");

        System.out.println(Vehicle.numOfCars + " Vehicle object has been created");

        Vehicle bike = new Vehicle(2,"bike");

        System.out.println(Vehicle.numOfCars + " Vehicle objects have been created");

        Vehicle boat = new Vehicle(0,"boat");

        System.out.println(Vehicle.numOfCars + " Vehicle objects have been created");

        System.out.println(car.toString());

        System.out.println(bike.toString());

        System.out.println(boat.toString());


    }
}


class Vehicle {

    static int numOfCars;
    int wheels;
    String type;

    Vehicle(int wheels, String type) {

        this.wheels = wheels;
        this.type = type;
        numOfCars++;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "wheels=" + wheels +
                ", type='" + type + '\'' +
                '}';
    }
}
