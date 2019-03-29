package labs_examples.objects_classes_methods.labs.oop.A_inheritance.House_Exercise_01;

public class Windows extends Room{

    private int numWindows;
    private String shapeWindows;

    public Windows() {
    }

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

    public static void paintRoom(String colour, String windowFrameColour) {

        System.out.println("The room will be painted " + colour);
        System.out.println("However the window frames will be painted " + windowFrameColour);
    }

    @Override
    public String toString() {
        return "Windows{" +
                "numWindows=" + numWindows +
                ", shapeWindows='" + shapeWindows + '\'' +
                '}';
    }
}
