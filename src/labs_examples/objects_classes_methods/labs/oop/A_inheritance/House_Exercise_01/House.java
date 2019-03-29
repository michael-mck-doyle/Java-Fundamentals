package labs_examples.objects_classes_methods.labs.oop.A_inheritance.House_Exercise_01;


// Create class
// Add instance variables
// create constructors - default & custom
// add getter and setter methods
// create toString

public class House {

   private int houseNumber;
   private String streetName;

   public House() {}

    public House(int houseNumber, String streetName) {
        this.houseNumber = houseNumber;
        this.streetName = streetName;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    @Override
    public String toString() {
        return "House{" +
                "houseNumber=" + houseNumber +
                ", streetName='" + streetName + '\'' +
                '}';
    }
}


