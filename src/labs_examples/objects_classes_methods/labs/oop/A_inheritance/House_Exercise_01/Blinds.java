package labs_examples.objects_classes_methods.labs.oop.A_inheritance.House_Exercise_01;

// create class, extend parent class
// add instance variables
// create constructors
// add getter and setter methods
// add toString

public class Blinds extends Windows {

    private String blindsColour;
    private String blindsMaterial;
    private int blindsHeight;
    private int blindsWidth;
    private int priceMaterial;
    private int cost;

    public Blinds() {}

    public Blinds(int houseNumber, String streetName, int rooms, int numWindows, String shapeWindows, String blindsColour, String blindsMaterial, int blindsHeight, int blindsWidth, int priceMaterial, int cost) {
        super(houseNumber, streetName, rooms, numWindows, shapeWindows);
        this.blindsColour = blindsColour;
        this.blindsMaterial = blindsMaterial;
        this.blindsHeight = blindsHeight;
        this.blindsWidth = blindsWidth;
        this.priceMaterial = priceMaterial;
        this.cost = cost;
    }

    protected int blindsCost(int blindsHeight, int blindsWidth, int priceMaterial) {

        int totalCost = (blindsHeight*blindsWidth)*priceMaterial;

        cost = totalCost;
         return cost;

    }

    public String getBlindsColour() {
        return blindsColour;
    }

    public void setBlindsColour(String blindsColour) {
        this.blindsColour = blindsColour;
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

    public int getPriceMaterial() {
        return priceMaterial;
    }

    public void setPriceMaterial(int priceMaterial) {
        this.priceMaterial = priceMaterial;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Blinds{" +
                "blindsColour='" + blindsColour + '\'' +
                ", blindsMaterial='" + blindsMaterial + '\'' +
                ", blindsHeight=" + blindsHeight +
                ", blindsWidth=" + blindsWidth +
                ", priceMaterial=" + priceMaterial +
                ", cost=" + cost +
                '}';
    }
}
