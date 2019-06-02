package practicePackage.static_nonstatic_variables_methods;

public class House {


    int squareFeet;
    String address;
    static int numHousesBuilt;

    public House(int squareFeet, String address) {

        this.squareFeet = squareFeet;
        this.address = address;
        numHousesBuilt++;
    }

    @Override
    public String toString() {
        return "House{" +
                "squareFeet=" + squareFeet +
                ", address='" + address + '\'' +
                ", numHousesBuilt = " +  numHousesBuilt + '}';
                
    }
}
