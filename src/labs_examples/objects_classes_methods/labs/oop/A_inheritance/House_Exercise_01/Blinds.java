package labs_examples.objects_classes_methods.labs.oop.A_inheritance.House_Exercise_01;

public class Blinds extends Windows {

    private String blindsColour;
    private String blindsMaterial;
    private int blindsHeight;
    private int blindsWidth;
    private int priceMaterial;
    //private int materialNeeded;
    //private int cost;  // cost = priceMaterial * materialNeeded

    public static int blindsCost(int blindsHeight, int blindsWidth, int priceMaterial) {

        int cost = (blindsHeight * blindsWidth) * priceMaterial;

        return cost;

        public int getPriceMaterial () {
            return priceMaterial;
        }

        public void setPriceMaterial(int priceMaterial){
            this.priceMaterial = priceMaterial;
        }

    /*public int getMaterialNeeded() {
        return materialNeeded;
    }*/

    /*public void setMaterialNeeded(int materialNeeded) {
        this.materialNeeded = materialNeeded;
    }*/


// create an array containing different prices depending on the material selected

    public Blinds() {
        }

    public Blinds( int houseNumber, String streetName,int rooms, int numWindows, String shapeWindows, String
        blindsColour, String blindsDirection, String blindsMaterial,int blindsHeight, int blindsWidth){
            super(houseNumber, streetName, rooms, numWindows, shapeWindows);
            this.blindsColour = blindsColour;
            this.blindsDirection = blindsDirection;
            this.blindsMaterial = blindsMaterial;
            this.blindsHeight = blindsHeight;
            this.blindsWidth = blindsWidth;
        }


        public String getBlindsColour () {
            return blindsColour;
        }

        public void setBlindsColour (String blindsColour){
            this.blindsColour = blindsColour;
        }

        public String getBlindsDirection () {
            return blindsDirection;
        }

        public void setBlindsDirection (String blindsDirection){
            this.blindsDirection = blindsDirection;
        }

        public String getBlindsMaterial () {
            return blindsMaterial;
        }

        public void setBlindsMaterial (String blindsMaterial){
            this.blindsMaterial = blindsMaterial;
        }

        public int getBlindsHeight () {
            return blindsHeight;
        }

        public void setBlindsHeight ( int blindsHeight){
            this.blindsHeight = blindsHeight;
        }

        public int getBlindsWidth () {
            return blindsWidth;
        }

        public void setBlindsWidth ( int blindsWidth){
            this.blindsWidth = blindsWidth;
        }

        @Override
        public String toString () {
            return "Blinds{" +
                    "blindsColour='" + blindsColour + '\'' +
                    ", blindsDirection='" + blindsDirection + '\'' +
                    ", blindsMaterial='" + blindsMaterial + '\'' +
                    ", blindsHeight=" + blindsHeight +
                    ", blindsWidth=" + blindsWidth +
                    ", priceMaterial=" + priceMaterial +
                    ", materialNeeded=" + materialNeeded +
                    ", cost=" + cost +
                    '}';
        }
    }
}
