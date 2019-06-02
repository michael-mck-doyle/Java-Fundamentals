package labs_examples.objects_classes_methods.labs.objects.aeroplaneExercise_1;

import java.util.ArrayList;

public class Aeroplane {

    private double fuelCapacity;
    private double currentFuelLevel;

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(double currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    private ArrayList<Passenger> passengers = new ArrayList<>();


    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Passenger p : passengers) {
            sb.append(p.toString());
        }
        return "Aeroplane{" +
                "passengers=" + sb.toString() +
                '}';


    }
}
