package practicePackage;

public class Example {
}
    public static void main(String[] args) {
        // create an object of the Example class so that we can call the non-static paintCar()
        // method below
        Example ex = new Example();
        // create a new Car object named "car" - it is a Blue Nissan XTerra
        Car car = new Car("Blue", "Nissan", "XTerra");
        // the line below will print "Blue"
        System.out.print("Car color is: " + car.getColor());
        // call the non-static paintCar() method using the "ex" object and pass the car object
        ex.paintCar(car);
        // the line below will print "Green"
        System.out.print("Car color is: " + car.getColor());
    }


    /* the method below accepts a Car object - it changes the color of the car - it does
    not need to return the car - because the carVar object in paintCar() is a reference
    to the object "car" created in the main() method. */
    public void paintCar(Car carVar){
        carVar.setColor("Green");
    }
}