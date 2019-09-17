package practicePackage;

import java.sql.SQLOutput;

public class ObjectComposition {


    public static void main(String[] args) {

        Engine newEngine = new Engine(400);
        Stereo newStereo = new Stereo("Panasonic");


    NewCar Roadster = new NewCar(newEngine, newStereo, "Porsche", "Black");

        System.out.println("My car is a " + Roadster.colour + " " + Roadster.model + ". It has a " + Roadster.stereo.brand + " stereo and a "
        + Roadster.engine.horsePower + " engine");
    }

}


class Engine {

    double horsePower;
    public Engine(double horsePower){
        this.horsePower = horsePower;
    }
}


class Stereo {

    String brand;
    public Stereo(String brand) {
        this.brand = brand;
    }
}

class NewCar {

    Engine engine;
    Stereo stereo;
    String model;
    String colour;

    public NewCar(Engine engine, Stereo stereo, String model, String colour) {

        this.engine = engine;
        this.stereo = stereo;
        this.model = model;
        this.colour = colour;
    }

}