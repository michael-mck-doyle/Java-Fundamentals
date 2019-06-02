package labs_examples.objects_classes_methods.labs.oop.A_inheritance.House_Exercise_01;

// create class, extend parent class
// add instance variables
// create constructors
// add getter and setter methods
// add toString

public class Windows extends Room {

    private int numWindows;
    private String shapeWindows;


    public Windows() {}

    public Windows(int houseNumber, String streetName, int rooms, int numWindows, String shapeWindows) {
        super(houseNumber, streetName, rooms);
        this.numWindows = numWindows;
        this.shapeWindows = shapeWindows;
    }

    public int getNumWindows() {
        return numWindows;
    }

    public void setNumWindows(int numWindows) {
        this.numWindows = numWindows;
    }

    public String getShapeWindows() {
        return shapeWindows;
    }

    public void setShapeWindows(String shapeWindows) {
        this.shapeWindows = shapeWindows;
    }

    @Override
    public String toString() {
        return "Windows{" +
                "numWindows=" + numWindows +
                ", shapeWindows='" + shapeWindows + '\'' +
                '}';
    }
}





