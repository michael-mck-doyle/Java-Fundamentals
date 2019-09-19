package labs_examples.objects_classes_methods.labs.objects;

import java.sql.SQLOutput;

public class exercise_01_Office_ObjectComposition {

    public static void main(String[] args) {

        Elevator elevator = new Elevator(8);
        Tennants tennants = new Tennants(5, "JavaInc");
        CarPark carPark = new CarPark(6, 400);
        OfficeBuilding officeBuilding = new OfficeBuilding(36, 4000, elevator, tennants, carPark);

        System.out.println(officeBuilding.tennants.getNameMainTenannt() + " is the main tennant in the office building." +
                " The building has " + officeBuilding.getFloors() + " floors and a capacity of " + officeBuilding.getCapacity()
        + " people. It has " + officeBuilding.elevator.getNumElevators() + " elevators. ");
    }

}


class OfficeBuilding{

    int floors;
    int capacity;
    Elevator elevator;
    Tennants tennants;
    CarPark carPark;

    public OfficeBuilding(int floors, int capacity, Elevator elevator, Tennants tennants, CarPark carPark){

        this.floors = floors;
        this.capacity = capacity;
        this.elevator = elevator;
        this.tennants = tennants;
        this.carPark = carPark;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Elevator getElevator() {
        return elevator;
    }

    public void setElevator(Elevator elevator) {
        this.elevator = elevator;
    }

    public Tennants getTennants() {
        return tennants;
    }

    public void setTennants(Tennants tennants) {
        this.tennants = tennants;
    }

    public CarPark getCarPark() {
        return carPark;
    }

    public void setCarPark(CarPark carPark) {
        this.carPark = carPark;
    }
}



class Elevator {
    int numElevators;

    public Elevator(int numElevators){

        this.numElevators = numElevators;
    }

    public int getNumElevators() {
        return numElevators;
    }

    public void setNumElevators(int numElevators) {
        this.numElevators = numElevators;
    }
}


class Tennants {

    int numTennants;
    String nameMainTenannt;

    public Tennants(int numTennants, String nameMainTenannt){

        this.numTennants = numTennants;
        this.nameMainTenannt = nameMainTenannt;
    }

    public int getNumTennants() {
        return numTennants;
    }

    public void setNumTennants(int numTennants) {
        this.numTennants = numTennants;
    }

    public String getNameMainTenannt() {
        return nameMainTenannt;
    }

    public void setNameMainTenannt(String nameMainTenannt) {
        this.nameMainTenannt = nameMainTenannt;
    }
}

class CarPark {

    int levels;
    int spaces;

    public CarPark (int levels, int spaces){
        this.levels = levels;
        this.spaces = spaces;
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    public int getSpaces() {
        return spaces;
    }

    public void setSpaces(int spaces) {
        this.spaces = spaces;
    }
}



