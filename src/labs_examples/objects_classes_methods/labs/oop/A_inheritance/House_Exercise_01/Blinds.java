package labs_examples.objects_classes_methods.labs.oop.A_inheritance.House_Exercise_01;

public class Blinds extends Windows {

    private String blindsColour;
    private String blindsDirection;
    private String blindsMaterial;
    private int blindsHeight;
    private int blindsWidth;

    public Blinds() {
    }

    public Blinds(int houseNumber, String streetName, int rooms, int numWindows, String shapeWindows, String blindsColour, String blindsDirection, String blindsMaterial, int blindsHeight, int blindsWidth) {
        super(houseNumber, streetName, rooms, numWindows, shapeWindows);
        this.blindsColour = blindsColour;
        this.blindsDirection = blindsDirection;
        this.blindsMaterial = blindsMaterial;
        this.blindsHeight = blindsHeight;
        this.blindsWidth = blindsWidth;
    }

    public String getBlindsColour() {
        return blindsColour;
    }

    public void setBlindsColour(String blindsColour) {
        this.blindsColour = blindsColour;
    }

    public String getBlindsDirection() {
        return blindsDirection;
    }

    public void setBlindsDirection(String blindsDirection) {
        this.blindsDirection = blindsDirection;
    }

    public String getBlindsMaterial() {
        return blindsMaterial;
    }

    public void setBlindsMaterial(String blindsMaterial) {
        this.blindsMaterial = blindsMaterial;
    }

    public int getBlindsHeight() {
        return blindsHeight;
    }

    public void setBlindsHeight(int blindsHeight) {
        this.blindsHeight = blindsHeight;
    }

    public int getBlindsWidth() {
        return blindsWidth;
    }

    public void setBlindsWidth(int blindsWidth) {
        this.blindsWidth = blindsWidth;
    }

    @Override
    public String toString() {
        return "Blinds{" +
                "blindsColour='" + blindsColour + '\'' +
                ", blindsDirection='" + blindsDirection + '\'' +
                ", blindsMaterial='" + blindsMaterial + '\'' +
                ", blindsHeight=" + blindsHeight +
                ", blindsWidth=" + blindsWidth +
                '}';
    }
}
