package labs_examples.objects_classes_methods.labs.objects.exercise_01_shoppingMall;

public class CarPark {

    int spaces;
    boolean parkingAttendant;

    public CarPark(int spaces, boolean parkingAttendant) {
        this.spaces = spaces;
        this.parkingAttendant = parkingAttendant;
    }

    public int getSpaces() {
        return spaces;
    }

    public void setSpaces(int spaces) {
        this.spaces = spaces;
    }

    public boolean isParkingAttendant() {
        return parkingAttendant;
    }

    public void setParkingAttendant(boolean parkingAttendant) {
        this.parkingAttendant = parkingAttendant;
    }

    @Override
    public String toString() {
        return "CarPark{" +
                "spaces=" + spaces +
                ", parkingAttendant=" + parkingAttendant +
                '}';
    }
}
