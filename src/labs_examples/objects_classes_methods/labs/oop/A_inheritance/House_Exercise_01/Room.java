package labs_examples.objects_classes_methods.labs.oop.A_inheritance.House_Exercise_01;

// create Class, extend parent class
// create instance variables
// create constructors
// add getter and setter methods
// add toString


public class Room extends House {

    private int rooms;

    public Room(){}

    public Room(int houseNumber, String streetName, int rooms) {
        super(houseNumber, streetName);
        this.rooms = rooms;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "Room{" +
                "rooms=" + rooms +
                '}';
    }
}
