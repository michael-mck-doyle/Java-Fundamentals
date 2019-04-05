
package practicePackage;

class Car {

    String make;
    String model;
    public void drive(int distance) {}

}

class Sportscar extends Car {

    boolean hasRaceTyres;
    boolean hasSpoilers;

    public double getZeroToSixtyTime(double acceleration) {

        return acceleration;
    }



    @Override
    public String toString() {
        return "Sportscar{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", hasRaceTyres=" + hasRaceTyres +
                ", hasSpoilers=" + hasSpoilers +
                '}';
    }
}






public class inheritance_Practice_1 {


    public static void main(String[] args) {

        Sportscar ferrari = new Sportscar();
        ferrari.make = "Ferrari";
        ferrari.model = "XXX";
        ferrari.hasSpoilers = true;
        ferrari.hasRaceTyres = true;
        ferrari.drive(20);
        ferrari.getZeroToSixtyTime(4.2);


        System.out.println(ferrari.toString());
    }

}





