package labs_examples.objects_classes_methods.labs.objects.exercise_01_aeroplane_2;

public class Aeroplane {

    double fuelCapacity;
    double currentFuelLevel;


    Manufacturer manufacturer;
    Engines engines;
    Catering catering;
    Seating seat;

    public Aeroplane(double fuelCapacity, double currentFuelLevel, Manufacturer manufacturer, Engines engines, Catering catering, Seating seat) {
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
        this.manufacturer = manufacturer;
        this.engines = engines;
        this.catering = catering;
        this.seat = seat;
    }

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

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Engines getEngines() {
        return engines;
    }

    public void setEngines(Engines engines) {
        this.engines = engines;
    }

    public Catering getCatering() {
        return catering;
    }

    public void setCatering(Catering catering) {
        this.catering = catering;
    }

    public Seating getSeat() {
        return seat;
    }

    public void setSeat(Seating seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Aeroplane{" +
                "fuelCapacity=" + fuelCapacity +
                ", currentFuelLevel=" + currentFuelLevel +
                ", manufacturer=" + manufacturer +
                ", engines=" + engines +
                ", catering=" + catering +
                ", seat=" + seat +
                '}';
    }
}
