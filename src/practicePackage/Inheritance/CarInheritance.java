package practicePackage.Inheritance;

public class CarInheritance {

    public static void main(String[] args) {

        Car newCar = new Car("toyota", "t-class", 5, 6000);

        newCar.sellCar("toyota","t-class",5,6500);

        SuperCar turbo = new SuperCar();

        turbo.sellCar("Hotrod", "Go faster",2,15000);


        turbo.additionalGears = 3;
        turbo.engineSize = 1800;

        System.out.println("In addition to " + newCar.make + " features, 'turbo' also has " + turbo.additionalGears +
                " additional gears and a " + turbo.engineSize + " engine size.");
    }
}

