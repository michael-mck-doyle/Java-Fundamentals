package practicePackage;

public class multiLevelInheritance_Practice_2 {

    public static void main(String[] args) {

        Ducati bike1 = new Ducati();

        System.out.println(bike1.toString());
    }

}


class Vehicle {

    int mpg;
    int fuel_capacity;
    String type;
}


class Motorcycle extends Vehicle {

    int cubicLiters;
}

class Ducati extends Motorcycle {

    boolean dryClutch = true;

    public Ducati () {

        // belongs to Vehicle class
        mpg = 30;
        fuel_capacity = 10;
        //belongs to Motorcycle class
        cubicLiters = 2000;
        //belongs to Ducati class
        dryClutch = true;
    }

    @Override
    public String toString() {
        return "Ducati{" +
                "mpg=" + mpg +
                ", fuel_capacity=" + fuel_capacity +
                ", type='" + type + '\'' +
                ", cubicLiters=" + cubicLiters +
                ", dryClutch=" + dryClutch +
                '}';
    }
}